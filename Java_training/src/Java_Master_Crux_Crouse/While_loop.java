package Java_Master_Crux_Crouse;

public class While_loop {
	public static void main(String[] args) {
		int counter = 1; // Initialize the variable
		while (counter <= 5) { // if the condition is satisfied it will go inside the while block
			System.out.println("hello"); // The print statement is executed

			counter++; // this step is re-initialize the variable
			// this counter is the most important part.
			// if you don't put counter++ then this program will go to infinite loop.
			// every time inside while statement get executed the counter inc by 1.
		 	// when the counter is less then or equal to condition the loop gets terminated.
		}
	}

}
