package BT_Java;

import java.util.Scanner;

public class lg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap luong: ");
		int luongrong = scanner.nextInt();
		System.out.println("luong rong: " + luongrong);
		double thue;
		if (luongrong >= 15000000) {
			thue = luongrong * (30.0 / 100);
		} else if (luongrong >= 7000000) {
			thue = luongrong * (20.0 / 100);
		} else {
			thue = luongrong * (10.0 / 100);
		}
		System.out.println("luong sau tru: " + thue);
		scanner.close();
	}
}
