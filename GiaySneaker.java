package javaoop;

public class GiaySneaker extends GiayDep {
	private String style;
	private String color;
	
	
	public GiaySneaker(String id, String nameShoe, String size, double price, int quantity, String style,
			String color) {
		super(id, nameShoe, size, price, quantity);
		this.style = style;
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return 	"-------------------------\n" 
				 +"Mã giày: " + this.id + "\n"
		         + "Tên giày: " + this.nameShoe + "\n"
		         + "Size giày: " + this.size + "\n"
		         + "Giá giày: " + this.price + "\n"
		         + "Số lượng giày: " + this.quantity +"\n"
		         + "kiểu dáng " + this.style + "\n"
		         + "màu sắc " + this.color ; 
	}
}
