package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	int number = new Random().nextInt(4);
	System.out.print(number);
	JOptionPane.showInputDialog("What do you think is awesome");
	if (number == 0) {
		JOptionPane.showMessageDialog(null,"What you entered is awesome");
	} 
	

	if (number == 1) {
		JOptionPane.showMessageDialog(null,"What you entered is ok");
	}
	if (number == 2) {
		JOptionPane.showMessageDialog(null,"What you entered is boring");

	}
	if (number == 3) {
		JOptionPane.showMessageDialog(null,"What you entered is wierd");
	}
	

	

 
}


	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


