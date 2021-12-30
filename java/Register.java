

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		 
		          
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/student","root","root");  
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into template values(?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,p);  
		  
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...");  
		RequestDispatcher rs = request.getRequestDispatcher("login.html");
        rs.include(request, response);
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		
	}

}
