package BT_Java;

import java.util.Scanner;

public class UCLN {
	public static int timUCLN(int a, int b) {
		int ucln = Math.min(a, b);
		while (ucln > 0) {
			if (a % ucln == 0 && b % ucln == 0) {
				break;
			}
			ucln--;
		}
		return ucln;
	}

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap so thu nhat:");
		int soThuNhat = nhap.nextInt();
		System.out.println("Nhap so thu hai:");
		int soThuHai = nhap.nextInt();

		int ucln = timUCLN(soThuNhat, soThuHai);

		System.out.println("Uoc chung lon nhat " + soThuNhat + " va " + soThuHai + " la: " + ucln);
		nhap.close();
	}
}
