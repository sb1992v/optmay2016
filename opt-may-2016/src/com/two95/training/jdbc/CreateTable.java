package com.two95.training.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	public static void main(String args[]) throws Exception {
		String createCustomerSql = "CREATE TABLE CUSTOMERS" + "(" + "FIRSTNAME VARCHAR(50)," + "MIDDLENAME VARCHAR(2),"
				+ "LASTNAME VARCHAR(50)," + "AGE NUMERIC(2)," + "SSN NUMERIC(10)," + "CITY VARCHAR(32),"
				+ "STATE VARCHAR(2)," + "COUNTRY VARCHAR(40)" + ")";
		createTable(createCustomerSql);
	}

	private static void createTable(String sql) throws Exception {
		// Create the DDL

		// Get the connection using our utils.
		Connection con = PostGreSqlConnectionUtil.getConnection();
		if (con != null) {
			// Create statement from connection
			Statement stmt = con.createStatement();
			// Execute the statement by passing the sql
			int result = stmt.executeUpdate(sql);
			if (result != -1) {
				System.out.println("Table created sucessfully");
			} else {
				System.out.println("Could'nt create table. Please check your SQL syntax");
			}
			// Close the statements and Connections
			stmt.close();
			PostGreSqlConnectionUtil.closeConnection();
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}
