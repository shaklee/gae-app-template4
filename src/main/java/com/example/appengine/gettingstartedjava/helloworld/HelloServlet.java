package com.example.appengine.gettingstartedjava.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START example]
//@SuppressWarnings("serial")
//@WebServlet(name = "helloworld", value = "/")
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("Flex Servlet");
		out.println("Springboot 1");
		// out.println("Local");
		//out.println("Service 1");
		//out.println("Auto Scale");
	}
}
// [END example]
