package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Sum_of_Natural_number_Method_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number form where you want the sum of natural number");
		int counter = 1;
		int sum = 0;
		int num = sc.nextInt();
		while (counter <= num) {
			sum = sum + counter;
		

			counter++;
		}
		System.out.println("The sum of natural number is : " + sum);

	}

}
