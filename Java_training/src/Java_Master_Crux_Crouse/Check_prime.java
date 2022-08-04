package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Check_prime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number you want to check prime or not");
		int num = in.nextInt();
		int div = 2;
		boolean flag = true;
		;
		while (div < num - 1) {
			if (num % div == 0) {
				flag = false;
			}
			div++;
		}
		if (flag == true) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}

	}

}
