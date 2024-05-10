package BT_Java;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);
		String ten, gioitinh;
		int tuoi;
		System.out.println("nhap tên: ");
		ten = scaner.nextLine();
		System.out.println(" tuổi: ");
		tuoi = scaner.nextInt();
		scaner.nextLine();
		System.out.println("giới tính: ");
		gioitinh = scaner.nextLine();

		if (tuoi >= 18 && gioitinh.equals("nam")) {
			System.out.println("nhap ngu: ");
		} else if (tuoi >= 20 && gioitinh.equals("nu")) {
			System.out.println("nhap ngu: ");

		} else {
			System.out.println("chua den tuoi: ");
		}
		scaner.close();

	}

}
