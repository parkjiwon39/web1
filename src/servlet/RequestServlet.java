package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/request")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//HttpServletRequest로 가져올 수 있는 정보들
		PrintWriter out= response.getWriter();
		out.printf("Request URI : %s<br>",request.getRequestURI());
		out.printf("Request URI : %s<br>",request.getRequestURI());
		out.printf("Context Path : %s<br>",request.getContextPath());
		out.printf("Request Protocal : %s<br>",request.getProtocol());
		out.printf("Request Address : %s<br>",request.getRemoteAddr());
		out.printf("Request port : %s<br>",request.getRemotePort());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
