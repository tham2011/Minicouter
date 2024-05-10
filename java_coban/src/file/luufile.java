package file;

import java.io.PrintWriter;

import KeThua.sinhvien;

public class luufile {
	public static void main(String[] args) {

		try {
			PrintWriter Input = new PrintWriter("Test.txt", "UTF-8");
			Input.println("Xin chào!");
			Input.println("Tuổi:" + 20);
			sinhvien SV = new sinhvien(0, "Trung", 2004, 0);
			Input.println(SV);
			Input.flush();
			Input.close();
			System.out.println("Dữ liệu đã được lưu vào file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
