package products;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddingArtServlet
 */
@WebServlet("/PurchaseArtworkServlet")
public class PurchaseArtworkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Database database;
	
	public void init() {
		database = new Database();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] product_ids = request.getParameterValues("id");
		Invoice invoice = new Invoice();
		for (int i = 0; i < product_ids.length; i++) {
			Painting selection = database.get(product_ids[i]); 
			invoice.addLineItem(new LineItem(selection, 1));
		}
		request.setAttribute("invoice", invoice);
				
		String url = "/show_invoice.jsp";
		RequestDispatcher dispatcher =
				getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
