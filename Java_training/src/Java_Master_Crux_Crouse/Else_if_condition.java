package Java_Master_Crux_Crouse;

import java.util.*;

public class Else_if_condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();

		if (age <= 12) {
			System.out.println("The person is child with the age of : " + age);
		} else if (age > 12 && age <= 18) {
			System.out.println("The person is Teenager  with the age of : " + age);

		} else if (age > 18 && age <= 60) {
			System.out.println("The person is adult with the age of : " + age);

		} else {
			System.out.println("The Person is an old age : " + age);
		}

	}

}
