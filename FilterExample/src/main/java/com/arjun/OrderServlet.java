package com.arjun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class OrderServlet extends HttpServlet 
{
	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
	throws SerialException,IOException
	{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter())
		{
			System.out.println("OrderServlet Executed");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet OrderServlet<title>");
			out.println("<!DOCTYPE html>");	
			out.println("Welcome to order page");
			out.println("This is order page");
			out.println("<head>");
			out.println("<html>");
		}
	}
}	
