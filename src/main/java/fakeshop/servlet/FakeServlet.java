package fakeshop.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// En casi todos los servidores JEE se puede, pero para Jetty no es tan sencillo
//@WebServlet("/fake")
// De modo que lo configuramos a la antigua usanza, o sea, en el web.xml
// Para visitar este servlet ve a 
// http://localhost:8080/fakeshop/fake
public class FakeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Using GET Method to Read Form Data";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n"
				+ "  <li><b>First Name</b>: " + request.getParameter("first_name") + "\n" + "  <li><b>Last Name</b>: "
				+ request.getParameter("last_name") + "\n" + "</ul>\n" + "</body></html>");
	}
}
