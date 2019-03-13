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
  public static void update(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
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
			System.out.println(rows + " row(s) updated");
			// Close the connection.
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
  public static void CreateEvent(String EventName)
	{
            String DB_URL ="jdbc:mysql://localhost:3306/teammap_db_events";
		try
		{
                    Connection conn = DriverManager.getConnection(DB_URL, "root", "");
			// Get a Statement object.
			Statement stmt = conn.createStatement();
			// Create the table.
			stmt.execute("CREATE TABLE `"+EventName+ "`(" +
						"`ID` VARCHAR(5) NOT NULL PRIMARY KEY, " +
						"`Name` VARCHAR(255) NOT NULL, " +
						"`Group` VARCHAR(255))");
			
			System.out.println("Event Created created.");
		}
		catch (SQLException ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
   public static void delete(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
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
			System.out.println(rows + " row(s) deleted");
			// Close the connection.
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
      public static void dropevent(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db";
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
			// Close the connection.
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("ERROR: " + ex.getMessage());
		}
  }
      public static void Attend(String Query)
  {
          final String DB_URL = "jdbc:mysql://localhost:3306/teammap_db_event";
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
}
