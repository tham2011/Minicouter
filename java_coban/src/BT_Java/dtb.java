package BT_Java;

import java.util.Scanner;

public class dtb {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		int diemtb = scaner.nextInt();
		if (diemtb >= 9) {
			System.out.println(" hang a: ");
		} else if (diemtb >= 7 && diemtb < 9) {
			System.out.println(" hang b ");
		} else if (diemtb >= 5 && diemtb < 7) {
			System.out.println("hang c :");
		} else {
			System.out.println("hang f : ");
		}
		scaner.close();
	}
}
