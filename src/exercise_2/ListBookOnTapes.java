package exercise_2;

import java.util.ArrayList;

public class ListBookOnTapes {
	private ArrayList<BookOnTape> listBookOnTapes;
	
	public ListBookOnTapes() {
		this.listBookOnTapes = new ArrayList<BookOnTape>();
	}
	
	// Thêm dữ liệu vào danh sách
	public void addBookOnTape(BookOnTape bookOnTape) {
		this.listBookOnTapes.add(bookOnTape);
	}
	
	// In danh sách ra màn hình
	public void printListBookOnTapes() {
		for (BookOnTape bookOnTape : listBookOnTapes) {
			System.out.println(bookOnTape.getDescription());
		}
	}
	
	// Tra cứu thông tin dựa vào mã seri
	public void lookUpOnSerialNumber(String serialNumber) {
		for (BookOnTape bookOnTape : listBookOnTapes) {
			if(bookOnTape.getSerialNumber().indexOf(serialNumber) >= 0) {
				System.out.println(bookOnTape.getDescription());
			}
		}
	}
}
