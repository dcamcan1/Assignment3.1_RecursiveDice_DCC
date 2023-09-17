import java.util.Random;
/** Class to represent a six-sided, recursive die
 *  capable of being rolled to get a random integer.
 *  @author Danny Cannon
 */
public class RecDieRoller {

	//Instance Variables
	int dieFace, count;
	
	//Method
	/** Recursive method to simulate rolling the die. 
	 *  Calls itself until a 2 shows up. */
	public void roll() {
		/** Uses a random integer to "roll" a number between 1 and 6. */
		Random rand = new Random();
		dieFace = rand.nextInt(6) + 1;
		count++;
		/** Prints the rolled number. */
		System.out.println("rolling..." + dieFace);
		if (dieFace == 2) {
			System.out.println("You rolled a 2!");
			return;
		}//end if
		else {
			roll();
		}//end else
	}//end roll method
	
	/** Gets the count. 
	 *  @return the integer count. */
	public int getCount() {
		return count;
	}//end getCount method
	
	/** Sets roll counter to specified integer.
	 *  @param count  The user's desired count. */
	public void setCount(int count) {
		this.count = count;
	}//end setCount method
}//end class
