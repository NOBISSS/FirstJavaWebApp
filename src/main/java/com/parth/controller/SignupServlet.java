package com.parth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Signup Request Received</h1>");
		out.println("<p>Name:"+name+"</p>");
		out.println("<p>Email:"+email+"</p>");
	}
}
