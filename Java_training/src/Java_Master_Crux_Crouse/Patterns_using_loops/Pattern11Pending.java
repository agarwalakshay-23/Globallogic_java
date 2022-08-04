package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern11Pending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();
		int nst = 1;
		int nsp = n - i;
		

		for (; i <= n; i++) {
			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}
			nsp = nsp - 1;
			System.out.println();
		}

	}

}
