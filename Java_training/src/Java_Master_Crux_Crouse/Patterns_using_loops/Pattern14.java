package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i=1;
		int nsp2=1;
		int nsp=n-1;
		int nst1=2*n-i;
		int nst=1;
		for(; i<=2*n-1; i++) {
			if(i<=n) {
				for(int j=1; j<=nsp; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=nst; j++) {
					System.out.print("*");
				}
				System.out.println();
				nst=nst+1;
				nsp=nsp-1;
			}
			else {
				for(i=n+1; i<=nsp2; i++) {
					System.out.print(" ");
				}
				for(i=n+1; i<=nst1;i++) {
					System.out.print("*");
				}
				
				nsp=nsp+1;
				nst1=nst-1;
			}
			System.out.println();
		}
		
	}

}
