package BT_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class nh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> so = new ArrayList<>();
		System.out.println("nhap số lượng: ");
		while (true) {
			double x = sc.nextDouble();
			so.add(x);
			System.out.println("nhap thêm (y/n)");
			sc.nextLine();
			if (sc.equals("N") || sc.equals("n"))
				;
			{
				break;
			}

		}
		System.out.println("Danh sách số thực đã nhập:");
		for (double So : so) {
			System.out.println(So);
		}
		double sum = 0;
		for (double So : so) {
			sum += So;
		}
		System.out.println("Tổng của danh sách: " + sum);
	}
}
