package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Reverse_The_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number you want to reverse : ");
		int num = sc.nextInt();
		System.out.println("The number you entered is : " + num);
		int reverse = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			reverse = reverse * 10 + rem;

		}
		System.out.println("The reverse of the number is  : " + reverse);
	}

}
