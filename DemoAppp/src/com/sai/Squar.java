package com.sai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squar extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		
		
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out=res.getWriter();
		
		out.println(k);
		System.out.println("sql called");
	}
}
