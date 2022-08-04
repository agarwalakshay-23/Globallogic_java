package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= nst; col++) {
				System.out.print("* ");
			}
			System.out.println();
			nst = nst - 1;

		}
	}
}
