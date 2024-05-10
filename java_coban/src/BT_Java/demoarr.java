package BT_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demoarr {
	public static void Cratelist(int n) {
		for (int i = 0; i < n; i++) {
			arrlist.add(ren.nextInt(100));

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> danhSach = new ArrayList<>();

		System.out.print("Nhap so luong ptu: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			danhSach.add((int) (Math.random() * 100) + 1);
		}

		System.out.println("Danh sach ban dau:");
		System.out.println(danhSach);

		Collections.sort(danhSach);
		System.out.println("Danh sach sau khi sap xep:");
		System.out.println(danhSach);

		System.out.print("Nhap vi tri muon chen/xoa/sua: ");
		int viTri = scanner.nextInt();
		if (viTri >= 0 && viTri < danhSach.size()) {
			System.out.print("Nhap gtri moi: ");
			int giaTriMoi = scanner.nextInt();

			danhSach.set(viTri, giaTriMoi);
			System.out.println("Danh sach sau khi thay doi:");
			System.out.println(danhSach);
		} else {
			System.out.println("Vi tri khong hop le");
		}

		scanner.close();
	}
}
