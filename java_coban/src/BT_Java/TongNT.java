package BT_Java;

import java.util.Scanner;

public class TongNT {
	static Scanner nhap = new Scanner(System.in);

	public static void TinhTong(int[] arr, int n) {
		int tong = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = nhap.nextInt();
			tong += arr[i];
		}
		System.out.println("Tong cac so trong mang la: " + tong);
	}

	public static boolean laSoNguyenTo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void TongNT(int[] arr, int n) {
		System.out.println("Cac so nguyen to trong mang:");
		for (int i = 0; i < n; i++) {
			if (laSoNguyenTo(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(); // In một dòng trống để phân biệt giữa các giá trị số nguyên tố và tổng của
								// chúng
		int tong = 0;
		for (int i = 0; i < n; i++) {
			if (laSoNguyenTo(arr[i])) {
				tong += arr[i];
			}
		}
		System.out.println("Tong cac so nguyen to trong mang la: " + tong);
	}

	public static void main(String[] args) {
		System.out.println("1. Tinh tong n so nguyen dau tien");
		System.out.println("2. Tinh tong so nguyen to");
		System.out.println("Vui long nhap lua chon:");
		int luaChon = nhap.nextInt();
		if (luaChon == 1) {
			System.out.print("Nhap so phan tu cho mang: ");
			int n = nhap.nextInt();
			int[] arr = new int[n];
			TinhTong(arr, n);
		} else if (luaChon == 2) {
			System.out.print("Nhap so phan tu cho mang: ");
			int n = nhap.nextInt();
			int[] arr = new int[n];
			System.out.println("Nhap cac gia tri cho mang:");
			for (int i = 0; i < n; i++) {
				arr[i] = nhap.nextInt();
			}
			TongNT(arr, n);
		} else {
			System.out.println("Lua chon ko hop le!");
			return;
		}
	}
}
