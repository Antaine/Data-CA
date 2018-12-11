package ie.gmit.sw;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	 private DataSource mysqlDS;

	 public DAO() throws Exception {
	     Context context = new InitialContext();
	     String jndiName = "java:comp/env/emp"; // name in web.xml & context.xml
	     mysqlDS = (DataSource) context.lookup(jndiName);
	  }
	 
	 public List<Product> loadProducts() throws SQLException{
		 System.out.println("DAO works");
		 Connection conn = mysqlDS.getConnection();
		 Statement myStmt = conn.createStatement();
		 String query = "select * from product";
		 ResultSet rs = myStmt.executeQuery(query);
		 
		 List<Product> products = new ArrayList<>();
		 
		 while( rs.next() ) {
			int pid = rs.getInt("PRODID");
			String desc = rs.getString("DESCRIP");
			
			products.add(new Product(pid, desc));
		}
		 
		 return products;
	 }
}
