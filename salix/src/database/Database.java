package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import orders.Order;
import orders.LineItem;
import products.Painting;

public class Database {
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			return createConnection();
		}
	}
	
	private static Connection createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String db_url = "jdbc:mysql://localhost:3306/salix";
			String username = "root";
			String password = "root";
			connection = DriverManager.getConnection(db_url, username, password);
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Painting[] getPaintings() {
		ArrayList<Painting> paintings = new ArrayList<Painting>();
		try {
			Connection connection = getConnection();
			String query = "SELECT * FROM products";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet product_records = statement.executeQuery();
			while (product_records.next()) {
				Painting painting = toPainting(product_records);
				paintings.add(painting);
			}
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		return paintings.toArray(new Painting[0]);
	}
	
	public static Painting getPainting(int product_id) {
		try {
			Connection connection = getConnection();
			String query = "SELECT * FROM products WHERE product_id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, product_id);
			ResultSet product_record = statement.executeQuery();
			if (product_record.next()) {
				return toPainting(product_record);
			} else {
				return null;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static Painting toPainting(ResultSet product_record) {
		try {
			int product_id		= product_record.getInt("product_id");
			String title 		= product_record.getString("title");
			int year_created 	= product_record.getInt("year_created");
			int width 			= product_record.getInt("width");
			int height 			= product_record.getInt("height");
			String medium 		= product_record.getString("medium");
			String surface 		= product_record.getString("surface");
			String file 		= product_record.getString("file");
			double price 		= product_record.getDouble("price");
			boolean for_sale 	= product_record.getBoolean("for_sale");
			Painting p = new Painting(product_id, title, year_created, 
									  height, width, medium, surface, 
									  file, price, for_sale);
			return p;
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean addOrder(Order order) {
		int order_id = order.getOrderID();
		try {
			Connection connection = getConnection();
			String query = "INSERT INTO orders(order_id) VALUES(?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, order_id);
			int number_of_rows = statement.executeUpdate();
			if (number_of_rows == 1) {
				return addLineItems(order);
			} else {
				return false;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private static boolean addLineItems(Order order) {
		LineItem[] line_items = order.getLineItems();
		for (LineItem line_item : line_items) {
			if (!addLineItem(order.getOrderID(), line_item.getProduct().getProductID(), line_item.getQuantity())){
				return false;
			}
		}
		return true;
	}
	
	private static boolean addLineItem(int order_id, int product_id, int quantity) {
		try {
			Connection connection = Database.getConnection();
			String query = "INSERT INTO orders_products VALUES(?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, order_id);
			ps.setInt(2, product_id);
			ps.setInt(3, quantity);
			int rows = ps.executeUpdate();
			return (rows == 1);	
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public static Order[] getOrders() {
		ArrayList<Order> orders = new ArrayList<Order>();
		try {
			Connection connection = Database.getConnection();
			Statement statement = connection.createStatement();
			ResultSet order_records = statement.executeQuery("SELECT * FROM orders");
			while (order_records.next()) {
				int order_id 			= order_records.getInt("order_id");
				Date date_created		= order_records.getTimestamp("date_created");
				LineItem[] line_items 	= getLineItems(order_id);
				Order order = new Order(line_items);
				order.setOrderID(order_id);
				order.setDateCreated(date_created);
				orders.add(order);
			}
		} 
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return orders.toArray(new Order[0]);
	}
	
	private static LineItem[] getLineItems(int order_id){
		ArrayList<LineItem> line_items = new ArrayList<LineItem>();
		try {
			Connection connection = Database.getConnection();
			String query = "SELECT * FROM orders_products WHERE order_id = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, order_id);
			ResultSet order_product_records = ps.executeQuery();
			while (order_product_records.next()){
				Painting painting 	= getPainting(order_product_records.getInt("product_id"));
				int quantity 		= order_product_records.getInt("quantity");
				LineItem line_item 	= new LineItem(painting, quantity);
				line_items.add(line_item);
			} 
		} catch (SQLException e){
				e.printStackTrace();
		}
		return line_items.toArray(new LineItem[0]);
	}
	
	public static Integer getHighestOrderID() {
		try {
			Connection connection = Database.getConnection();
			String query = "SELECT MAX(order_id) as order_id from orders";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt("order_id");
			} else {
				return null;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
