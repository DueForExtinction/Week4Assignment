package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmailCreator;

/**
 * Servlet implementation class createEmailServlet
 */
@WebServlet("/createEmailServlet")
public class createEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createEmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userFName = request.getParameter("userFName");
		String userLName = request.getParameter("userLName");
		
		EmailCreator email = new EmailCreator(userFName, userLName);

		request.setAttribute("Email", email);
		getServletContext().getRequestDispatcher("/SPageResult.jsp").forward(request, response);
		
	}

}
