package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un = request.getParameter("Username");
        String pw = request.getParameter("Password");
        String fn = request.getParameter("First_Name");
        String ln = request.getParameter("Last_Name");
        String add = request.getParameter("Address");
        String num = request.getParameter("Contact_No");
        String gend = request.getParameter("Gender");
        String age = request.getParameter("Age");

        if (un.equals("meghaaa_r") && pw.equals("megha123")) {
            response.sendRedirect("success.html");
            return;
        } else {
            response.sendRedirect("error.html");
            return;
        } 
       
    }
		
	}


