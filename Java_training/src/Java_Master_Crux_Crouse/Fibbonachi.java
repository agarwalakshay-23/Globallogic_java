package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Fibbonachi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int n = sc.nextInt();
		int counter = 1;
		System.out.print("0,");
		System.out.print(" 1");
		while (counter <= n) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" ," + sum);
			counter++;

		}

	}

}
