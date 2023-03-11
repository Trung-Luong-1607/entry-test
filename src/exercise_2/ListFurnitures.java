package exercise_2;

import java.util.ArrayList;

public class ListFurnitures {
	private ArrayList<Furniture> listFurnitures;
	
	public ListFurnitures() {
		this.listFurnitures = new ArrayList<Furniture>();
	}
	
	// Thêm dữ liệu vào danh sách
	public void addFurniture(Furniture furniture) {
		this.listFurnitures.add(furniture);
	}
	
	// In danh sách ra màn hình
	public void printListFurnitures() {
		for (Furniture furniture : listFurnitures) {
			System.out.println(furniture.getDescription());
		}
	}
	
	// Tra cứu thông tin dựa vào mã seri
	public void lookUpOnSerialNumber(String serialNumber) {
		for (Furniture furniture : listFurnitures) {
			if(furniture.getSerialNumber().indexOf(serialNumber) >= 0) {
				System.out.println(furniture.getDescription());
			}
		}
	}
}
