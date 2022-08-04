package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int nsp = 0;
		for (int i = 1; i <= n; i++) {

			for (int k = 0; k < nsp; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= nst; j++) {
				System.out.print("*");
			}

			System.out.println();
			nst = nst - 1;
			nsp = nsp + 1;
		}

	}

}
