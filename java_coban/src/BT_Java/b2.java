package BT_Java;

import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int diem = scaner.nextInt();

		if (diem >= 6.5 && diem <= 10) {
			System.out.println("kha: ");
		} else if (diem >= 4 && diem < 6.5) {
			System.out.println(" trung binh: ");
		} else {
			System.out.println(" yeu: ");
		}
		scaner.close();
	}
}
