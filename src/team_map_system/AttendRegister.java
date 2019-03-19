/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_map_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author XCree
 */
public class AttendRegister {
 public static String ID,Name,Group,Event;
 public static int Count;
public static boolean Call(String UID,String Event) throws SQLException
	{
           
             final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
           Connection conn = DriverManager.getConnection(DB_URL, "root", "");
                 Statement stmt = conn.createStatement();
		String Password; // Flag
		// Create a SELECT statement to get the specified
		// row from the Coffee table.
		String sqlStatement = "SELECT * FROM members WHERE ID = '" + UID + "'";
		// Send the SELECT statement to the DBMS.
		ResultSet result = stmt.executeQuery(sqlStatement);
		boolean UIDFound; // Flag
		if (result.next())
		{
                    ID = result.getString("ID");
                    Name = result.getString("Name");
                    Group = result.getString("Groups");
                UIDFound = true;
		}
		else
		{
			// Indicate the product was not found.
			UIDFound = false;
		}
                
                if(UIDFound)
                {
                insert("Insert into `"+Event+"` Values ('"+ID+"','"+Name+"','"+Group+"');");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"UID Not Found");
                }
                count(Event);
		return UIDFound;
	}
public static void insert(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db_events";
      try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL, "root", "");
			Statement stmt = conn.createStatement();
			// Create a string with an INSERT statement.
			String sqlStatement = Query;
			// Send the statement to the DBMS.
			int rows = stmt.executeUpdate(sqlStatement);
			// Display the results.
			System.out.println(rows + " row(s) added to the table.");
			// Close the connection.
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
public static void count(String event)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db_events";
      try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL, "root", "");
			Statement stmt = conn.createStatement();
			// Create a string with an INSERT statement.
			String sqlStatement = "Select Count(*) from `"+event+"`";
			// Send the statement to the DBMS.
			ResultSet result = stmt.executeQuery(sqlStatement);
		if (result.next())
		{
                    Count = result.getInt(1);
		}
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
}


