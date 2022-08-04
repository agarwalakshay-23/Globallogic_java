package Java_Master_Crux_Crouse;

public class For_loops_Initialization {

	public static void main(String[] args) {

		// Method 1 for for loop to initialize the loop

		for (int i = 1; i <= 5; i++) {
			System.out.println("This is the 1st method for the for loop");
		}
		System.out.println("---------------------------------------------");

		// Method 2 for for loop to initialize the loop

		int j = 1;
		for (; j <= 5; j++) {
			System.out.println("This is the 2nd method for the for loop");

		}
		System.out.println("---------------------------------------------");
		// Method 3 for for loop to initialize the loop

		int k = 1;
		for (; k <= 5;) {
			System.out.println("This is the 3rd method for the for loop");

			k++;

		}
		// Method 4 for The to Initialize the Infinite For loop

		System.out.println("---------------------------------------------");
//		for (;;) {
//			System.out.println("You are in the Infinite loop");
//		}
	}

}
