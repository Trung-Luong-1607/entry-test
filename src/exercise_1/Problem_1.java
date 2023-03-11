package exercise_1;

import java.util.Scanner;

public class Problem_1 {
	
	/*
	1. Nhập dữ liệu vào
	2. Tách từ
	3. Tìm độ dài từng từ, nếu từ có đồ dài lớn nhất thì thực hiện gán
	4. Xuất ra kết quả
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhập dữ liệu vào
		System.out.println("Nhập chuỗi đầu vào :");
		String input = sc.nextLine();
		// Tách từ trong chuỗi đưa vào mảng 
		String[] inputs = input.split(" ");
		// Khai báo ví trí của phần tử, độ dài lớn nhất của từ
		int index = 0;
		int lengthMax = 0;
		
		for (int i = 0; i < inputs.length; i++) {
			int length = inputs[i].length();
			if(length > lengthMax) {
				lengthMax = length;
				index = i;
			}
		}
		
		// Xuất kết quả
		System.out.println("Chuỗi đầu ra : " + inputs[index]);
	}
}
