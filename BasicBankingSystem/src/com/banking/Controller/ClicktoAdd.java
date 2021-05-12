package com.banking.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.Model.*;
/**
 * Servlet implementation class ClicktoAdd
 */
@WebServlet("/ClicktoAdd")
public class ClicktoAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClicktoAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name=request.getParameter("uname");
		String Email=request.getParameter("uemail");
		String credit=request.getParameter("uamount");
		int Credit=Integer.parseInt(credit);
       AddUser user=new AddUser(Name,Email,Credit);		
	    int status=Dao.AddUser(user);
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
