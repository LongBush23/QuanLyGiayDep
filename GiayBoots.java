package javaoop;

public class GiayBoots extends GiayDep{
	private String material;
	private String color;
	
	public GiayBoots(String id, String nameShoe, String size, double price, int quantity, String material,
			String color) {
		super(id, nameShoe, size, price, quantity);
		this.material = material;
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return   "-------------------------\n" 
				 +"Mã giày: " + this.id + "\n"
		         + "Tên giày: " + this.nameShoe + "\n"
		         + "Size giày: " + this.size + "\n"
		         + "Giá giày: " + this.price + "\n"
		         + "Số lượng giày: " + this.quantity + "\n"
		         + "chất liệu: " + this.material + "\n"
		         + "màu sắc: " + this.color ;
	}
	
}
