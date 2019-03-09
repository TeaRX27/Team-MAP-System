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
}
