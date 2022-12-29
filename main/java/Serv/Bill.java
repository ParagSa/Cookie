package Serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electric
 */
@WebServlet("/Bill")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> al = new ArrayList<>();
		
		Cookie [] c = request.getCookies();
		if(c!=null) {
			for(Cookie k : c) {
				al.add(k.getValue());
			}
			
		}
		
		
		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");
		if(itm1 != null) {
			al.add(itm1);
		}
		if(itm2 != null) {
			al.add(itm2);
		}
		
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Bill</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h2>Items</h2>");
		for(String s :al) {
			
			out.print("<h2>"+s+"</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
