package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of divident");
		int divident=sc.nextInt();
		System.out.println("Enter the value of divisor");

		int divisor=sc.nextInt();
		int rem;
		while(divident%divisor!=0) {
			 rem=divident%divisor;
			 divident=divisor;
			 divisor=rem;

		}
		System.out.println("The H.C.F is equal to : " + divisor);
	}

}
