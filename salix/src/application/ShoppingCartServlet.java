package application;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import orders.Order;
import orders.ShoppingCart;

import database.Database;

@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private UG database;
	
	public void init() {
		//database = new UG();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ShoppingCart shopping_cart = (ShoppingCart) session.getAttribute("shopping_cart");
		if (shopping_cart == null) {
			shopping_cart = new ShoppingCart();
		}
		
		String action = request.getParameter("action");
		
		int product_id = 0;
		if (request.getParameter("product_id") != null) {
			product_id = Integer.parseInt(request.getParameter("product_id"));
		}
		
		String message = null;
		
		if (action != null && product_id != 0) {	
			if (action.equals("add_product")) {
				shopping_cart.addProduct(product_id);
			} else if (action.equals("remove_product")) {
				shopping_cart.removeProduct(product_id);
			} else if (action.equals("remove_line_item")) {
				shopping_cart.removeLineItem(product_id);
			}
		} else if (action != null && action.equals("finalize")) {
			Order order = new Order(shopping_cart.getLineItems());
			if (!Database.addOrder(order)) {
				message = "An error occured while processing your order.  Your order was not submitted.";
			} else {
				shopping_cart.emptyCart();
			}
		}
		
		session.setAttribute("shopping_cart", shopping_cart);
		request.setAttribute("message", message);
		
		String destination = "/shopping_cart.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	}
	
}
