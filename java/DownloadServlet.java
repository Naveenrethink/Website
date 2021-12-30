

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServle
 */
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DownloadServlet() {
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter(); 
request.getRequestDispatcher("link.html").include(request, response);

String filename = "home.txt";   
String filepath = "e:\\";   
response.setContentType("APPLICATION/OCTET-STREAM");   
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
  
FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
            
int i;   
while ((i=fileInputStream.read()) != -1) {  
out.write(i);   
}   
fileInputStream.close();   
out.close();  

}  

}
