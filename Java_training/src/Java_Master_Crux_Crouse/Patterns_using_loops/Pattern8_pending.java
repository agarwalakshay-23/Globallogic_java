package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern8_pending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nst = 1;
		int n = sc.nextInt();
		int nsp = n - 2;
		int nsp1=0;

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= nst; j++) {
					System.out.print("*");
				}
				for (int k = 1; k <= nsp; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= nst; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=1; j<=nst;j++) {
					System.out.print("*");
				}
				
				
			}System.out.println();
		}

	}

}
