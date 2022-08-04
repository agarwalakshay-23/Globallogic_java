package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern0_demoPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// step1 : The number of rows

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			// step 2 : work need to be done
			System.out.print("*");

			// step3: Preparation for the upcoming lines
			System.out.println();

		}
	}

}
