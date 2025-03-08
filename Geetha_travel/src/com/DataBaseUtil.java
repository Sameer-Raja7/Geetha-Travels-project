package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseUtil {
	 private static final String URL = "jdbc:mysql://localhost/travel";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "9676411217";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
}
}

