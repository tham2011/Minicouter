package BT_Java;

import java.util.Arrays;
import java.util.Random;

public class sohoc {
	private int[] a;
	private int n;

	public sohoc(int n) {
		this.n = n;
		a = new int[n];

	}

	public void nhapDaySoNgauNhien() {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(100) + 1; // Random số từ 1 đến 100
		}
	}

	public void indayso() {
		System.out.println("dãy số: ");
		for (int i = 0; i <= 0; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}

	public int sumSoNguyenTo() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (isPrime(a[i])) {
				sum += a[i];
			}
		}
		return sum;
	}

	public void sapXepDaySo() {
		Arrays.sort(a);
	}

	public void themPhanTu(int value) {
		int[] newArray = Arrays.copyOf(a, n + 1);
		newArray[n] = value;
		a = newArray;
		n++;
	}

	public void xoaPhanTu(int index) {
		if (index >= 0 && index < n) {
			for (int i = index; i < n - 1; i++) {
				a[i] = a[i + 1];
			}
			n--;
			a = Arrays.copyOf(a, n);
		} else {
			System.out.println("Index không hợp lệ.");
		}
	}

	private boolean isPrime(int num) {
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

	public static void main(String[] args) {
		sohoc soHoc = new sohoc(10);
		soHoc.nhapDaySoNgauNhien();
		soHoc.indayso();
		System.out.println("Tổng dãy số: " + soHoc.sum());
		System.out.println("Tổng các số nguyên tố trong dãy: " + soHoc.sumSoNguyenTo());
		soHoc.sapXepDaySo();
		System.out.println("Dãy số sau khi sắp xếp:");
		soHoc.indayso();
		soHoc.themPhanTu(50);
		System.out.println("Dãy số sau khi thêm phần tử:");
		soHoc.indayso();
		soHoc.xoaPhanTu(2);
		System.out.println("Dãy số sau khi xóa phần tử ở vị trí thứ 2:");
		soHoc.indayso();
	}
}