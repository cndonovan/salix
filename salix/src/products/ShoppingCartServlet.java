package products;

import application.Cart;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Database database;
	
	public void init() {
		//database = new Database();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Cart cart = (Cart) session.getAttribute("cart");
		if (cart == null) {
			cart = new Cart();
		}
		String action = request.getParameter("action");
		String id = request.getParameter("id");
		
		if (action != null && id != null) {
			
			if (action.equals("increment")) {
				cart.addItem(id);
			} else if (action.equals("decrement")) {
				cart.removeItem(id);
			} else if (action.equals("remove")) {
				cart.removeAllItems(id);
			}
		} 
		/*
		else {
			String[] product_ids = request.getParameterValues("id");
			Invoice invoice = new Invoice();
			for (int i = 0; i < product_ids.length; i++) {
				Painting selection = database.get(product_ids[i]); 
				invoice.addLineItem(new LineItem(selection, 1));
				cart.addItem(product_ids[i]);
			}
			request.setAttribute("invoice", invoice);
			destination = "/shopping_cart.jsp";
		} 
		*/
		
		session.setAttribute("cart", cart);
		
		String destination = "/shopping_cart.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destination);
		dispatcher.forward(request, response);
	}

}
