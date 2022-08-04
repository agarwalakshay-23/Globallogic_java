package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nst = 1;
		int nsp = 3;
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}

			} else {
				for (int k = 1; k <= 1; k++) {
					System.out.print("*");
				}
				for (int l = 1; l <= n - 2; l++) {
					System.out.print(" ");
				}

				for (int k = 1; k <= 1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
