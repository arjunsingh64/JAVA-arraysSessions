package com.arjun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class ProfileServlet extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
	throws SerialException,IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter())
		{
			System.out.println("Profile Servlet Executes");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet ProfileServlet<title>");
			out.println("<!DOCTYPE html>");	
			out.println("Welcome to profile page");
			out.println("This is profile page");
			out.println("<head>");
			out.println("<html>");
		}
	}
}
