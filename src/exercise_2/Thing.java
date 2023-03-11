package exercise_2;

import java.time.LocalDate;

public abstract class Thing {
	// Số seri
	private String serialNumber;
	
	// Mã mặt hàng
	private String skuCode;
	
	// Tên mặt hàng
	private String productName;
	
	// Hãng sản xuất
	private String manufacturer;
	
	// Xuất xứ
	private String origin;
	
	// Giá
	private int price;
	
	// Số lượng
	private int quantity;
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Thing(String serialNumber, String skuCode, String productName, String manufacturer, String origin, int price,
			int quantity) {
		this.serialNumber = serialNumber;
		this.skuCode = skuCode;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.origin = origin;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract String getDescription();	
}
