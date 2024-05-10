package BT_Java;

import java.util.Scanner;

public class bai5 {
	static Scanner nhap = new Scanner(System.in);

	public static void nhap(int[] a, int n) {

		for (int i = 0; i < n; i++)
			;
		do {
			System.out.println("nhap gia tri cho mang: " + i + ":");
			arr[i] = nhap.nextInt();

		} while (arr[i] < 0 || arr[i] > 100);
	}

	public static void TinhTB(int[] arr, int n) {
		int Tong = 0;
		for (int i = 0; i < n; i++) {
			Tong += arr[i];9
		}
		int trungBinh = Tong / arr.length;
		System.out.println("Trung binh cong cua mang la: " + trungBinh);
	}

	public static void chanLe(int[] arr, int n) {// tính chẳn lẽ
		int TChan = 0;
		int TLe = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				TChan += arr[i];
			} else {
				TLe += arr[i];
			}
		}
		System.out.print("Tong cac so chan la:" + TChan + "\n");
		System.out.print("Tong cac so le la:" + TLe + "\n");
	}

	public static boolean KTnguyenTo(int Number) {// kiểm tra số nguyên tố
		if (Number <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(Number); i++) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int TongNT(int[] arr, int n) {// in và tính tổng số nguyên tố
		System.out.print("Cac so nguyen to trong mang la:");
		for (int i = 0; i < n; i++) {
			if (KTnguyenTo(arr[i])) {
				System.out.print(arr[i] + "\t");

			}

		}
		System.out.println();
		int TongNT = 0;
		for (int i = 0; i < n; i++) {
			if (KTnguyenTo(arr[i])) {
				TongNT += arr[i];
			}
		}
		System.out.print("tong cac so nguyen to la:" + TongNT);
		return TongNT;
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
		Scanner nhap = new Scanner(System.in);
		int[] arr = null;
		int n = 0;
		int LuaChon;
		do {
			System.out.println("====================================");
			System.out.println("1.Nhap gia tri cho mang");
			System.out.println("2.In thong tin mang");
			System.out.println("3.Tinh trung binh cong");
			System.out.println("4.Tinh tong cac phan tu chan le");
			System.out.println("5.Tinh tong cac so nguyen to");
			System.out.println("6.Sap xep lai mang");
			System.out.println("7.Chen phan thu vao day so");
			System.out.println("8.Xoa phan tu trong day so");
			System.out.println("0.Thoat");
			System.out.println("====================================");
			System.out.println("Nhap lua chon:");
			LuaChon = nhap.nextInt();
			switch (LuaChon) {
			case 1:
				System.out.println("Nhap so luong phan tu cua mang: ");
				n = nhap.nextInt();
				arr = new int[n];
				nhap(arr, n, nhap);
				break;
			case 2:
				if (arr != null && n > 0) {
					in(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 3:
				if (arr != null && n > 0) {
					TinhTB(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 4:
				if (arr != null && n > 0) {
					chanLe(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 5:
				if (arr != null && n > 0) {
					TongNT(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 6:
				if (arr != null && n > 0) {
					Interchange_Sort(arr, n);
				} else {
					System.out.println("Mang chua duoc khoi tao hoac rong.");
				}
				break;
			case 7:
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
			case 8:
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
		} while (LuaChon != 0);
	}
}