package javaoop;

public class GiaySport extends GiayDep{
	private String brand;
	private String durability;
	
	public GiaySport(String id, String nameShoe, String size, double price, int quantity, String brand,
			String durability) {
		super(id, nameShoe, size, price, quantity);
		this.brand = brand;
		this.durability = durability;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDurability() {
		return durability;
	}
	public void setDurability(String durability) {
		this.durability = durability;
	}
	
	@Override
	public String toString() {
		return 	"-------------------------\n" 
				 + "Mã giày: " + this.id + "\n"
		         + "Tên giày: " + this.nameShoe + "\n"
		         + "Size giày: " + this.size + "\n"
		         + "Giá giày: " + this.price + "\n"
		         + "Số lượng giày: " + this.quantity + "\n"
		         + "hãng giày: " + this.brand + "\n"
		         + "độ bền: " + this.durability;
	}
	
	
}
