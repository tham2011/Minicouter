package BT_Java;

import java.util.Scanner;

public class kk {

	public static void main(String[] args) {
		int n = 0;
		Scanner nhap = new Scanner(System.in);
		try {
			System.out.println("Nhap vao 1 so nguyen n:");// đúng
			n = nhap.nextInt();
		} catch (Exception e) {
			System.out.println("Gia tri nhap vao ko dung vui long nhap lai!");// sai

		} finally {

			nhap.close();// chắc chắn chạy vào
		}
	}
}
