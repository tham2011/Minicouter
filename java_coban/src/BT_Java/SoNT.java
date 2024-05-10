package BT_Java;

import java.util.Scanner;

public class SoNT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen bat ky:");
		int values = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < values - 1; i++) {
			if (values % i == 0) {
				System.out.println("Uoc so khac: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to", values);
		} else {
			System.out.printf("%d khong phai la so nguyen to", values);
		}
		scanner.close();
	}

}
