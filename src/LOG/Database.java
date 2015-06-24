package LOG;

import java.sql.*;
import java.util.*;
import java.io.*;

public class Database extends AbstractClass implements MyInterface {

	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/logshashank";
	final String USERNAME = "root";
	final String PASSWORD = "";

	Connection conn = null;
	Statement stmt = null;

	/**
	 * Store in MySQL Database.
	 */
	public void store() {
		try {
			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			Statement stmt = null;
			stmt = conn.createStatement();

			String sql = "INSERT into mytable(Name,Salary) values('" + Name
					+ "'," + Salary + ");";

			int resultSet = stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {
			System.out.println("error:" + e.getMessage());
		}
	}
}
