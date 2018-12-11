package ie.gmit.sw;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Product {
	
	private int pid;
	private String desc;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Product(int pid, String desc) {
		super();
		this.pid = pid;
		this.desc = desc;
	}
	
	

}
