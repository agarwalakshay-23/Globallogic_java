package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int nsp = n - 1;
		int nst = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= nst; k++) {

				System.out.print("*");
			}
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 1;

		}
	}

}
