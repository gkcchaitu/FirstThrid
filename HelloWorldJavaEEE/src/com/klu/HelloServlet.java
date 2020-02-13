package com.klu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p=request.getParameter("number");
		String n=request.getParameter("name");
		//PrintWriter writer=response.getWriter();
		//writer.println("Number is"+p);
		//writer.println("Number is"+n);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaitu1","chaitu1");
			System.out.println(con);
			PreparedStatement pst = con.prepareStatement(" insert into data values(?,?)");
			pst.setString(1, p);
			pst.setString(2, n);
			int i=pst.executeUpdate();
			if (i > 0)	
		
				
				System.out.println("you are inserted succesfully");
 
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from data");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				
				
			}
			rs.close();
			} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

}
