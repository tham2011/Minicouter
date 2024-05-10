package BT_Java;

import java.util.Scanner;

public class VD01 {
	public static void main(String[] args) {
		int[] a;
		int n;
		Scanner data = new Scanner(System.in);
		System.out.println("n=: ");
		n = data.nextInt();
		a = new int[n];
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d", i);
			a[i] = data.nextInt();
		}
		int s = 0;
		for (int i = 0; i < n; i++)
			System.out.printf("%5d", a[i]);

	}
}
