import java.io.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
import com.oreilly.servlet.MultipartRequest;  
  
@WebServlet("/go")
public class UploadServlet extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
response.setContentType("text/html"); 
PrintWriter out = response.getWriter();  
request.getRequestDispatcher("link.html").include(request, response);
          
MultipartRequest m=new MultipartRequest(request,"d:/new");  
out.print("successfully uploaded");  
}  
}  