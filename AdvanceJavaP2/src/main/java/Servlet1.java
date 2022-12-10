

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		String u1=req.getParameter("uname");
		String p1=req.getParameter("pass");
		
		if(u1.equals("admin")&&p1.equals("admin@123"))
		{
			RequestDispatcher r1=req.getRequestDispatcher("sucess.html");
			r1.forward(req, resp);
			//out.println("LoginSucess!!!");
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			out.println("LoginFail!!");
		}
		
		//out.println("Welcome to::"+u1+""+p1);
	}

}
