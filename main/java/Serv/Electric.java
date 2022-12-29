package Serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electric
 */
@WebServlet("/Electric")
public class Electric extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Electric</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action ='Electronic'>");
		out.print("<h1><input type='checkbox' name='item1' value='fan'>Fan</h1>");
		out.print("<h1><input type='checkbox' name='item2' value='cooler'>Cooler</h1>");
		out.print("<h2><button type='submit'>Next</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
