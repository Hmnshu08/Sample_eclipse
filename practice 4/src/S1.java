

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			String n = request.getParameter("first_name");
			String m = request.getParameter("last_name");
			out.print("Welcome " +n);
			out.print(" " +m);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
