package com.edu.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lgoin
 */
@WebServlet(name = "Login", urlPatterns = { "/login" })
public class Lgoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lgoin() {
        super();
       
    }

    @Override
	public void init() throws ServletException {
    	
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		callTime();
		response.setContentType("text/html");
	
		try (PrintWriter out = response.getWriter()) 
		{
			out.print("<!DOCTYPE html>");
			out.print("<html lang=\"en\">");
			out.print("<head>");
			out.print("<title>Date</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1>"+callTime()+"</h1>");
			out.print("<form method='post' action='login'>");
			out.print("<button type='submit' > Temps </button>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");
			out.print("<!DOCTYPE html>");
			
		}
		
	}
	
	
	private String callTime () {
		LocalTime localTime = LocalTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("mm:hh:ss");
		System.out.println(localTime.format(df));
		return df.format(localTime);
	}

}
