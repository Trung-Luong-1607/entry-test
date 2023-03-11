package exercise_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListVideos listVideos = new ListVideos();
		ListBookOnTapes listBookOnTapes = new ListBookOnTapes();
		ListFurnitures listFurnitures = new ListFurnitures();
		
		int option = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println(
			  "1.	Nhập dữ liệu cho Video (Băng).\n"
			+ "2.	Nhập dữ liệu cho Book on tape (Băng sách audio).\n"
			+ "3.	Nhập dữ liệu cho Furniture (Đồ nội thất).\n"
			+ "4.	Xuất ra thông tin danh sách Video (Băng).\n"
			+ "5.	Xuất ra thông tin danh sách Book on tape (Băng sách audio).\n"
			+ "6.	Xuất ra thông tin danh sách Furniture (Đồ nội thất).\n"
			+ "7.	Tra cứu thông tin mặt hàng bất kỳ dựa trên số seri (serial number) được nhập từ bàn phím.\n"
			+ "0.   Thoát khỏi chương trình");
			System.out.println("Vui lòng chọn chức năng: ");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				case 1: {
					System.out.println("Số seri: ");
					String serialNumber = sc.nextLine();
					
					System.out.println("Mã mặt hàng: ");
					String skuCode = sc.nextLine();
					
					System.out.println("Tên mặt hàng: ");
					String productName = sc.nextLine();
					
					System.out.println("Hãng sản xuất: ");
					String manufacturer = sc.nextLine();
					
					System.out.println("Nơi xuất xứ: ");
					String origin = sc.nextLine();
					
					System.out.println("Giá: ");
					int price = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Số lượng: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Thể loại: ");
					String category = sc.nextLine();
					
					System.out.println("Dung lượng: ");
					String capacity = sc.nextLine();
					
					Video video = new Video(serialNumber, skuCode, productName, manufacturer, 
							origin, price, quantity, category, capacity);
					
					listVideos.addVideo(video);
					break;
				}
				case 2: {
					System.out.println("Số seri: ");
					String serialNumber = sc.nextLine();
					
					System.out.println("Mã mặt hàng: ");
					String skuCode = sc.nextLine();
					
					System.out.println("Tên mặt hàng: ");
					String productName = sc.nextLine();
					
					System.out.println("Hãng sản xuất: ");
					String manufacturer = sc.nextLine();
					
					System.out.println("Nơi xuất xứ: ");
					String origin = sc.nextLine();
					
					System.out.println("Giá: ");
					int price = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Số lượng: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Thể loại: ");
					String category = sc.nextLine();
					
					System.out.println("Dung lượng: ");
					String capacity = sc.nextLine();	
					
					BookOnTape bookOnTape = new BookOnTape(serialNumber, skuCode, productName, manufacturer,
							origin, price, quantity, category, capacity);
					
					listBookOnTapes.addBookOnTape(bookOnTape);
					break;
				}
				case 3: {
					System.out.println("Số seri: ");
					String serialNumber = sc.nextLine();
					
					System.out.println("Mã mặt hàng: ");
					String skuCode = sc.nextLine();
					
					System.out.println("Tên mặt hàng: ");
					String productName = sc.nextLine();
					
					System.out.println("Hãng sản xuất: ");
					String manufacturer = sc.nextLine();
					
					System.out.println("Nơi xuất xứ: ");
					String origin = sc.nextLine();
					
					System.out.println("Giá: ");
					int price = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Số lượng: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Kích thước: ");
					String size = sc.nextLine();
					
					System.out.println("Màu sắc: ");
					String color = sc.nextLine();
					
					System.out.println("Chất liệu: ");
					String fabric = sc.nextLine();	
					
					Furniture furniture = new Furniture(serialNumber, skuCode, productName, manufacturer,
							origin, price, quantity, size, color, fabric);
					
					listFurnitures.addFurniture(furniture);
					break;
				}
				case 4:
					// Xuất ra thông tin danh sách Video (Băng)
					listVideos.printListVideos();
					break;
				case 5:
					// Xuất ra thông tin danh sách Book on tape (Băng sách audio)
					listBookOnTapes.printListBookOnTapes();
					break;
				case 6:
					// Xuất ra thông tin danh sách Furniture (Đồ nội thất)
					listFurnitures.printListFurnitures();
					break;
				case 7:
					// Tra cứu thông tin mặt hàng bất kỳ dựa trên số seri (serial number) được nhập từ bàn phím
					System.out.println("Nhập mã seri: ");
					String serialNumber = sc.nextLine();
					System.out.println("Kết quả tra cứu: ");
					listVideos.lookUpOnSerialNumber(serialNumber);
					listBookOnTapes.lookUpOnSerialNumber(serialNumber);
					listFurnitures.lookUpOnSerialNumber(serialNumber);
					break;
			}
		}
		while(option != 0);
	}
}
