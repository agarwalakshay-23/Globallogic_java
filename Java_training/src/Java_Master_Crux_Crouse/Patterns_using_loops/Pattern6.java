package Java_Master_Crux_Crouse.Patterns_using_loops;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nsp=0;
		int nst=n;
		for(int row=1; row<=n;row++) {
			for(int i=0;i<nsp;i++) {
				System.out.print(" ");
			}
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			System.out.println();
			nsp=nsp+2;
			nst=nst-1;
			
		}
		
	}

}
