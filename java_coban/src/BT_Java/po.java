package BT_Java;

import java.util.Scanner;

public class po {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int[] arr = new int[99];

		int n = scaner.nextInt();
		for (int i = 0; i < 99; i++) {

			arr[i] = scaner.nextInt();
		}
		do {
			System.out.println("nhap phan tu");

		} while (n < 1 || n > 99);

		System.out.print("so : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");

		}
		scaner.close();
	}
}
