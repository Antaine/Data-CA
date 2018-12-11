package ie.gmit.sw;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ProductControler {
	
	private DAO dao;
	private List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public ProductControler() throws Exception {
		super();
		dao = new DAO();
	}

	public void loadProducts() throws SQLException{
		System.out.println("load products");
		this.products = dao.loadProducts();
	}
}
