

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class Welcome
 */
@WebServlet(name = "Welcome", urlPatterns = { "/Welcome" })
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        request.getRequestDispatcher("link.html").include(request, response);
	        out.println("Welcome user");
	       
	      }  

}
