package exercise_2;

import java.util.ArrayList;

public class ListVideos {
	private ArrayList<Video> listVideos;
	
	public ListVideos() {
		this.listVideos = new ArrayList<Video>();
	}
	
	// Thêm dữ liệu vào danh sách
	public void addVideo(Video video) {
		this.listVideos.add(video);
	}
	
	// In danh sách ra màn hình
	public void printListVideos() {
		for (Video video : listVideos) {
			System.out.println(video.getDescription());
		}
	}
	
	// Tra cứu thông tin dựa vào mã seri
	public void lookUpOnSerialNumber(String serialNumber) {
		for (Video video : listVideos) {
			if(video.getSerialNumber().indexOf(serialNumber) >= 0) {
				System.out.println(video.getDescription());
			}
		}
	}
}
