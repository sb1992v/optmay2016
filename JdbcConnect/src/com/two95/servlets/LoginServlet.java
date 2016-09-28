package com.two95.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see LoginServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException {
    	// This method is called before the following methods are called
    	//and gets called only ONCE. This is like a
    	// constructor. We do all the initialization here.
    	System.out.println("Servlet is initialized");
    	}

	/**
	 * @see LoginServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection connection = PostGreSqlConnectionUtil.getConnection();
		try {
			System.out.println("Printing Connection object"+connection.getSchema());
			System.out.println(connection.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(" " +new Date()).append(connection.toString());
	}

	/**
	 * @see LoginServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
