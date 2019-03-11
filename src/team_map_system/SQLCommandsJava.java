package team_map_system;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author XCree
 */
public class SQLCommandsJava {

    public static void testcon()
    {
        final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
		try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL, "root", "");
			System.out.println("Connection created to Team Map DB.");
			// Close the connection.
			conn.close();
			System.out.println("Connection closed.");
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
    }
    public static String Getpassword(String User) throws SQLException
	{
            
            final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
           Connection conn = DriverManager.getConnection(DB_URL, "root", "");
           Statement stmt = conn.createStatement();
		String Password; // Flag
		// Create a SELECT statement to get the specified
		// row from the Coffee table.
		String sqlStatement = "SELECT password FROM User WHERE User = '" + User + "'";
		// Send the SELECT statement to the DBMS.
		ResultSet result = stmt.executeQuery(sqlStatement);
		// Display the contents of the result set.
		if (result.next())
		{
			Password = result.getString("password");
		}
		else
		{
			// Indicate the product was not found.
			Password = "";
		}
		return Password;
	}
}
