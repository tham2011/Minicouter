package BT_Java;

import java.util.Scanner;

public class btsv {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int soSinhVien = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		String[][] danhSachSinhVien = new String[soSinhVien][3];

		for (int i = 0; i < soSinhVien; i++) {
			System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
			danhSachSinhVien[i][0] = scanner.nextLine(); // Ma sinh vien
			danhSachSinhVien[i][1] = scanner.nextLine(); // Ky hoc
			int soMonHoc;
			do {
				System.out.print("Nhap so mon hoc (toi thieu 3 mon): ");
				soMonHoc = scanner.nextInt();
				scanner.nextLine(); // Consume newline
			} while (soMonHoc < 3);

			double[] diemMonHoc = new double[soMonHoc];
			for (int j = 0; j < soMonHoc; j++) {
				double diem;
				do {
					System.out.print("Nhap diem mon hoc " + (j + 1) + ": ");
					diem = scanner.nextDouble();
				} while (diem < 0 || diem > 10);
				diemMonHoc[j] = diem;
			}
			danhSachSinhVien[i][2] = xepLoai(tinhDiemTrungBinh(diemMonHoc));
		}

		// In danh sach sinh vien
		System.out.println("\nDanh sach sinh vien:");
		System.out.println("STT | Ma sinh vien | Xep loai");
		for (int i = 0; i < soSinhVien; i++) {
			System.out.printf("%-4d| %-13s| %s\n", i + 1, danhSachSinhVien[i][0], danhSachSinhVien[i][2]);
		}
	}

	public static double tinhDiemTrungBinh(double[] diemMonHoc) {
		double sum = 0;
		for (double diem : diemMonHoc) {
			sum += diem;
		}
		return sum / diemMonHoc.length;
	}

	public static String xepLoai(double diemTrungBinh) {
		if (diemTrungBinh < 5) {
			return "D";
		} else if (diemTrungBinh < 6.5) {
			return "C";
		} else if (diemTrungBinh < 9) {
			return "B";
		} else {
			return "A";
		}
	}
}
