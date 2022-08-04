package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=0;
		int nst=2*n-1;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=nsp; j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			System.out.println();
			nst=nst-2;
			nsp++;
		}
		
	}

}
