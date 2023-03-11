package exercise_2;

public class Furniture extends Thing {
	
	// Kích thước
	private String size;
	
	// màu sắc
	private String color;
	
	// chất liệu
	private String fabric;
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Furniture(String serialNumber, String skuCode, String productName, String manufacturer, String origin,
			int price, int quantity, String size, String color, String fabric) {
		super(serialNumber, skuCode, productName, manufacturer, origin, price, quantity);
		this.size = size;
		this.color = color;
		this.fabric = fabric;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	@Override
	public String getDescription() {
		return "[ Số seri: " + this.getSerialNumber() + ", " + "Mã mặt hàng: " + this.getSkuCode()
		+ ", " + "Tên mặt hàng: " + this.getProductName() + ", "
		+ "Hãng sản xuất: " + this.getManufacturer() + ", " + "Nơi xuất xứ: " + this.getOrigin() + ", "
		+ "Giá: " + this.getPrice() + ", " + "Số lượng: " + this.getQuantity() + ", " + "Kích thước: " + this.getSize()
		+ ", " + "Màu sắc: " + this.getColor() + ", " + "Chất liệu: " + this.getFabric() + " ]";
	}
}
