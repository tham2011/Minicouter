package BT_Java;

import java.util.Scanner;

public class bai3 {

	static /*
			 * * 1 Viết chương trình nhập vào n số nguyên đầu tiên 2. In và tính tổng các
			 * số* chẵn / lẻ
			 */
	Scanner nhap = new Scanner(System.in);

	public static void SoNguyen(int[] arr, int n) {
		int tong = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia tri cho phan tu mang " + i + ":");
			arr[i] = nhap.nextInt();
			tong += arr[i];
		}
		System.out.println("Tong= " + tong);
	}

	public static void chanLe(int[] arr, int n) {
		int tongChan = 0;
		int tongLe = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia tri cho phan tu mang " + i + ":");
			arr[i] = nhap.nextInt();
			if (arr[i] % 2 == 0) {
				tongChan += arr[i];
			} else {
				tongLe += arr[i];
			}

		}
		System.out.println("Tong cac so chan la:" + tongChan);
		System.out.println("Tong cac so le la:" + tongLe);
	}

	public static void main(String[] args) {
		System.out.println("1. Tính tổng n số nguyên đầu tiên");
		System.out.println("2. Tính tổng số chẵn và lẻ");
		System.out.println("Vui lòng nhập lựa chọn:");
		int luaChon = nhap.nextInt();

		if (luaChon == 1) {
			System.out.print("Nhập số phần tử cho mảng: ");
			int n = nhap.nextInt();
			int[] arr = new int[n];
			SoNguyen(arr, n);
		} else if (luaChon == 2) {
			System.out.print("Nhập số phần tử cho mảng: ");
			int n = nhap.nextInt();
			int[] arr = new int[n];
			chanLe(arr, n);
		} else {
			System.out.println("Lựa chọn không hợp lệ!");
		}
	}

}
