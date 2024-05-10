package BT_Java;

import java.util.Scanner;

public class sho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int so;
		so = scanner.nextInt();
		String kq = (so > 100) ? ("lon") : ("be");
		System.out.println(kq);
		scanner.close();

	}
}
