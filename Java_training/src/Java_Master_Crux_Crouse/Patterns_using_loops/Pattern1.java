package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.*;

/*   n=5
   * * * * *
   * * * * *
   * * * * * 
   * * * * * 
   * * * * * 
 
  */

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
