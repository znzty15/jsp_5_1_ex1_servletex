package com.javagaeun.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("HelloWorld~!~!~!~!~!~!~!~!~!~!");
		response.setContentType("text/html; charset=utf-8"); // response ������ Ÿ���� HTMl�� ����
	      PrintWriter writer = response.getWriter();// �� �������� ����ϱ� ���� ��Ʈ�� ����
	      
	      writer.println("<html>");
	      writer.println("<head>");
	      writer.println("<body>");
	      writer.println("<h1>�ѱ��ѱ��ѱ�</h1>");
	      writer.println("</body>");
	      writer.println("</head>");
	      writer.println("</html>");
	      writer.close();
	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
