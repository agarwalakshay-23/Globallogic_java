package Java_Master_Crux_Crouse;

import java.util.Scanner;

public class Simple_Intrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Principle :");
		float p = sc.nextFloat();
		System.out.println("Enter the value of Rate :");
		float r = sc.nextFloat();
		System.out.println("Enter the value of Time :");
		float t = sc.nextFloat();

		double si = (p * r * t) / 100;
		System.out.println("The simple interest is equal to : " + si);

	}

}
