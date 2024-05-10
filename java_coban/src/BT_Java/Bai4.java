package BT_Java;

import java.util.Scanner;

public class Bai4 {
	static Scanner nhap = new Scanner(System.in);

	public static void TinhTong(int[] arr, int n) { // tính tổng
		int tong = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap gia tri cho mang: ");
			arr[i] = nhap.nextInt();
			tong += arr[i];
		}
		System.out.println("Tong cac gia tri trong mang la: " + tong);
	}

	public static void Interchange_Sort(int[] arr, int n) { // sắp xếp
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Mang sau khi sap xep la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void Chen(int[] arr, int n, int viTri, int giaTri) { // chèn phần tử vào mảng
		if (viTri < 0 || viTri > n) {
			System.out.println("Vi tri chen khong hop le");
			return;
		}

		for (int i = n - 1; i >= viTri; i--) {
			arr[i + 1] = arr[i];
		}
		arr[viTri] = giaTri;
		n++;
		System.out.print("Mang sau khi chen la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void Xoa(int[] arr, int n, int viTri) { // xóa phần tử khỏi mảng
		if (viTri < 0 || viTri >= n) {
			System.out.println("Vi tri xoa khong hop le");
			return;
		}
		for (int i = viTri; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.print("Mang sau khi xoa la: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = null;
		int n = 0;
		int choice;
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Nhap mang va tinh tong");
			System.out.println("2. Sap xep mang");
			System.out.println("3. Chen phan tu vao mang");
			System.out.println("4. Xoa phan tu khoi mang");
			System.out.println("0. Thoat");

			System.out.print("Nhap lua chon cua ban: ");
			choice = nhap.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Nhap so luong phan tu cua mang: ");
				n = nhap.nextInt();
				arr = new int[n];
				TinhTong(arr, n);
				break;
			case 2:
				if (arr != null && n > 0) {
					Interchange_Sort(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 3:
				if (arr != null && n > 0) {
					System.out.println("Nhap vi tri can chen: ");
					int viTriChen = nhap.nextInt();
					System.out.println("Nhap gia tri can chen: ");
					int giaTriChen = nhap.nextInt();
					Chen(arr, n, viTriChen, giaTriChen);
					n++;
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 4:
				if (arr != null && n > 0) {
					System.out.println("Nhap vi tri can xoa: ");
					int viTriXoa = nhap.nextInt();
					Xoa(arr, n, viTriXoa);
					n--;
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 0:
				System.out.println("Ket thuc chuong trinh.");
				return;
			default:
				System.out.println("Lua chon khong hop le. Vui long chon lai.");
			}
		}
	}
}
