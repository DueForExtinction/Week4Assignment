package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.currencyConverter;

/**
 * Servlet implementation class convertCurrencyServlet
 */
@WebServlet("/convertCurrencyServlet")
public class convertCurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public convertCurrencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userDolAmount = request.getParameter("userCurrency");
		
		currencyConverter dollars = new currencyConverter(Double.parseDouble(userDolAmount));
		
		request.setAttribute("Wallet", dollars);
		getServletContext().getRequestDispatcher("/FPageResult.jsp").forward(request, response);
	}

}
