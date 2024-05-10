package BT_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class btsohoc {
	private int n;
	private int[] arr;
	private ArrayList<Integer> sohoc = new ArrayList<>();
	private Scanner nhap = new Scanner(System.in);

	public btsohoc(int n) {
		this.n = n;
		this.arr = new int[n];
	}

	public void Nhap() {
		System.out.print("Nhap vao day so nguyen tu 1 den 100: ");
		for (int i = 0; i < n; i++) {
			try {
				int num = nhap.nextInt();
				if (num < 1 || num > 100) {
					throw new IllegalArgumentException("Nhap so khong hop le!");
				}
				arr[i] = num;
				sohoc.add(num);
			} catch (Exception e) {
				System.out.println("Nhap so khong hop le!");
				System.out.println("Vui long nhap lai.");
				nhap.nextLine();
				i--;
			}
		}
	}

	public void in() {
		System.out.println("Danh sach la:");
		for (Integer so : sohoc) {
			System.out.print(so + " ");
		}
		System.out.println();
	}

	public boolean laSoNguyenTo(int num) {
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

	public void TinhTong() {
		int tong = 0;
		int TongNT = 0;
		for (int i = 0; i < n; i++) {
			if (laSoNguyenTo(arr[i])) {
				TongNT += arr[i];
			} else {
				tong += arr[i];
			}
		}
		System.out.println("Tong cac so khong phai nguyen to: " + tong);
		System.out.println("Tong cac so nguyen to: " + TongNT);
	}

	public void SapXep() {
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

	public void Chen(int viTri, int giaTri) {
		if (viTri < 0 || viTri > n) {
			System.out.println("Vi tri chen khong hop le");
			return;
		}

		int[] newArr = new int[n + 1];
		for (int i = 0; i < viTri; i++) {
			newArr[i] = arr[i];
		}
		newArr[viTri] = giaTri;
		for (int i = viTri + 1; i < n + 1; i++) {
			newArr[i] = arr[i - 1];
		}

		arr = newArr;
		n++;
		System.out.print("Mang sau khi chen la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void Xoa(int viTri) {
		if (viTri < 0 || viTri >= n) {
			System.out.println("Vi tri xoa khong hop le");
			return;
		}
		for (int i = viTri; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		n--;
		System.out.print("Mang sau khi xoa la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu: ");
		int n = scanner.nextInt();
		btsohoc sohoc = new btsohoc(n);
		int luaChon;
		do {
			System.out.println("==================Menu===============");
			System.out.println("1.Nhap thong tin");
			System.out.println("2.In thong tin");
			System.out.println("3.Tinh tong");
			System.out.println("4.Sap xep day so");
			System.out.println("5.Them phan tu vao day so");
			System.out.println("6.Xoa phan tu vao day so");
			System.out.println("0. Thoat");
			System.out.println("=====================================");
			System.out.println();
			System.out.print("Vui long nhap lua chon: ");
			luaChon = scanner.nextInt();
			switch (luaChon) {
			case 1:
				sohoc.Nhap();
				break;
			case 2:
				sohoc.in();
				break;
			case 3:
				sohoc.TinhTong();
				break;
			case 4:
				sohoc.SapXep();
				break;
			case 5:
				System.out.print("Nhap vi tri can chen: ");
				int viTriChen = scanner.nextInt();
				System.out.print("Nhap gia tri can chen: ");
				int giaTriChen = scanner.nextInt();
				sohoc.Chen(viTriChen, giaTriChen);
				break;
			case 6:
				System.out.print("Nhap vi tri can xoa: ");
				int viTriXoa = scanner.nextInt();
				sohoc.Xoa(viTriXoa);
				break;
			case 0:
				System.out.println("Thoat chuong trinh.");
				break;
			default:
				System.out.println("Lua chon khong hop le. Vui long chon lai.");
			}
		} while (luaChon != 0);
		scanner.close();
	}
}
