package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int i=1;
		int nst1 = 2*n-i;
		for (; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= nst; j++) {
					System.out.print("* ");
				}
				nst = nst + 1;
			}

			else {
				for (int j = n + 1; j <= nst1; j++) {
					System.out.print("* ");
				}
				nst1=nst1-1;
				
			}
			System.out.println();
		}

	}
}
