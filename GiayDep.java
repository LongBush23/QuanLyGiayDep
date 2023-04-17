package javaoop;

public class GiayDep {
	protected String id;
	protected String nameShoe;
	protected String size;
	protected double price;
	protected int quantity;
	
	public GiayDep(String id, String nameShoe, String size, double price, int quantity) {
		super();
		this.id = id;
		this.nameShoe = nameShoe;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameShoe() {
		return nameShoe;
	}

	public void setNameShoe(String nameShoe) {
		this.nameShoe = nameShoe;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
	    return "-------------------------\n"
	    	 + "Mã giày: " + this.id + "\n"
	         + "Tên giày: " + this.nameShoe + "\n"
	         + "Size giày: " + this.size + "\n"
	         + "Giá giày: " + this.price + "\n"
	         + "Số lượng giày: " + this.quantity;
	}
}














