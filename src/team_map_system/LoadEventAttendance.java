/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_map_system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author XCree
 */
public class LoadEventAttendance {
    public final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db_events";
	private Connection conn;     // Database connection
	private String[][] tableData; // Table data
	private String[] colNames;    // Column names
	/**
	Constructor
	*/
	public LoadEventAttendance(String query)
	{
		// Get a connection to the database.
		getDatabaseConnection();
		try
		{
			// Create a Statement object for the query.
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			// Execute the query.
			ResultSet resultSet = stmt.executeQuery(query);
			// Get the number of rows.
			resultSet.last();                 // Move to last row
			int numRows = resultSet.getRow(); // Get row number
			resultSet.first();                // Move to first row
			// Get a metadata object for the result set.
			ResultSetMetaData meta = resultSet.getMetaData();
			// Create an array of Strings for the column names.
			colNames = new String[meta.getColumnCount()];
			// Store the column names in the colNames array.
			for (int i = 0; i < meta.getColumnCount(); i++)
			{
				// Get a column name.
				colNames[i] = meta.getColumnLabel(i+1);
			}
			// Create a 2D String array for the table data.
			tableData =
			new String[numRows][meta.getColumnCount()];
			// Store the columns in the tableData array.
			for (int row = 0; row < numRows; row++)
			{
				for (int col = 0; col < meta.getColumnCount(); col++)
				{
					tableData[row][col] = resultSet.getString(col + 1);
				}
				// Go to the next row in the ResultSet.
				resultSet.next();
			}
			// Close the statement and connection objects.
			stmt.close();
			conn.close();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	/**       
	The getDatabaseConnection method loads the JDBC
	and gets a connection to the database.
	*/
	private void getDatabaseConnection()
	{
		try
		{
			// Create a connection to the database.
			conn = DriverManager.getConnection(DB_URL, "root", "");
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
	/**
	The getColumnNames method returns the column names.
	*/
	public String[] getColumnNames()
	{
		return colNames;
	}
	/**
	The getTableData method returns the table data.
	*/
	public String[][] getTableData()
	{
		return tableData;
	}
}
