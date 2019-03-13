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
  public static void insert(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
      try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
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
  public static void update(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
      try
		{
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL, "root", "root");
			Statement stmt = conn.createStatement();
			// Create a string with an INSERT statement.
			String sqlStatement = Query;
			// Send the statement to the DBMS.
			int rows = stmt.executeUpdate(sqlStatement);
			// Display the results.
			System.out.println(rows + " row(s) updated");
			// Close the connection.
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
}
