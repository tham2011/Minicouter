package BT_Java;

import java.util.Scanner;

public class cho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();
		do {
			System.out.println("in: ");
			i++;
		} while (i < 1 || i > 99);
	}
}
