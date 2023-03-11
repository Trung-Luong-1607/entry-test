package exercise_2;

public class BookOnTape extends Thing {
	// Thể loại
	private String category;
	
	// Dung lượng
	private String capacity;

	public String getCategory() {
		return category;
	}

	public BookOnTape(String serialNumber, String skuCode, String productName, String manufacturer, String origin,
			int price, int quantity, String category, String capacity) {
		super(serialNumber, skuCode, productName, manufacturer, origin, price, quantity);
		this.category = category;
		this.capacity = capacity;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String getDescription() {
		return "[ Số seri: " + this.getSerialNumber() + ", " + "Mã mặt hàng: " + this.getSkuCode()
		+ ", " + "Tên mặt hàng: " + this.getProductName() + ", "
		+ "Hãng sản xuất: " + this.getManufacturer() + ", " + "Nơi xuất xứ: " + this.getOrigin() + ", "
		+ "Giá: " + this.getPrice() + ", " + "Số lượng: " + this.getQuantity() + ", " + "Thể loại: " + this.getCapacity()
		+ ", " + "Dung lượng: " + this.getCapacity() + " ]";
	}
	
}
