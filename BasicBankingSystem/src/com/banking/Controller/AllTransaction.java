package com.banking.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banking.Model.AddUser;

/**
 * Servlet implementation class ViewUserServlet
 */
@WebServlet("/AllTransaction")
public class AllTransaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllTransaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			List<AddUser> UserList=Dao.ViewUser();
			request.setAttribute("UserList", UserList);
	        RequestDispatcher rd=request.getRequestDispatcher("AllTransaction.jsp");
	        rd.forward(request, response);	
	}

}
