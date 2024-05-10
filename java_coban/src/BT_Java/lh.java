package BT_Java;

import java.util.Scanner;

public class lh {
	Scanner scaner = new Scanner(System.in);

	public static void ptbacnhat(double a, double b) {
		if (a == 0) {
			System.out.println("phuong trinh vo nghiem");
		} else if (b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else {
			double x = -b / a;
			System.out.println("nghiem la" + x);
		}

	}

	public static void ptbachai(double a, double b, double c) {
		if (a == 0) {
			System.out.println("phuong trinh vo nghiem: ");
		}

		else if (b == 0) {
			System.out.println("pt co 2 nghiem phan biet: ");
		} else if (c == 0) {
			System.out.println("Phương trình có 2 nghiem2: ");
		} else {
			double x = -c / b;
			System.out.println("Nghiệm của phương trình là: x = " + x);
		}

		double delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm.");
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Nghiệm kép của phương trình là: x = " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có hai nghiệm riêng biệt:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}

	public static void main(String[] args) {
		double a, b, c;
		Scanner scaner = new Scanner(System.in);
		System.out.println("phuong trinh bac nhat: ");
		System.out.println("phuong trinh bac hai : ");
		System.out.println("tinh : ");
		System.out.println("lua chon : ");
		int luachon = scaner.nextInt();
		if (luachon == 1) {
			System.out.println("nhap gia tri cho a: ");
			a = scaner.nextInt();
			System.out.println("nhap gia tri cho b:");
			b = scaner.nextInt();
			ptbacnhat(a, b);
		} else if (luachon == 2) {
			System.out.println("nhap gia tri cho a: ");
			a = scaner.nextInt();
			System.out.println("nhap gia tri cho b: ");
			b = scaner.nextInt();
			System.out.println("nhap gia tri cho c: ");
			c = scaner.nextInt();
			ptbachai(a, b, c);
		}

	}

}