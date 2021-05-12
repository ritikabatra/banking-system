package com.banking.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Transfer
 */
@WebServlet("/Transfer")
public class Transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    String sname=request.getParameter("Sname");
	String rname=request.getParameter("Rname");
	String amount=request.getParameter("amount");
	
	int Amount=Integer.parseInt(amount);
	int status=Dao.UpdateBalance(sname,rname,Amount);
	if(status>0)
    {
    	RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
    	rd.forward(request, response);
    }
    else
    {
    	RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
    	rd.forward(request, response);
    }

	
	}

	
}
