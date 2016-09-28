package com.two95.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			// Step 2: Get the connection by passing the URL
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
