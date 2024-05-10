package BT_Java;

import java.util.Scanner;

public class dt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diemtoan;
		do {
			diemtoan = scanner.nextInt();
			System.out.println("nhap diem toan: ");
		} while (diemtoan < 0 || diemtoan > 10);
		int diemly;
		do {
			diemly = scanner.nextInt();
			System.out.println("nhap diem ly: ");
		} while (diemly < 0 || diemly > 10);
		int diemhoa;
		do {
			diemhoa = scanner.nextInt();
			System.out.println("nhap diem hoa: ");
		} while (diemhoa < 0 || diemhoa > 10);

		double diemtb = (diemtoan + diemly + diemhoa) / 3;
		System.out.println("diem trung binh la: " + diemtb);
		scanner.close();
	}
}
