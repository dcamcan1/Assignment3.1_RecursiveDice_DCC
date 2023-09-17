/** Driver class to test RecDieRoller. 
 *  @author Danny Cannon
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {

		/** Initial testing for RecDieRoller class. */
		RecDieRoller rollATwo = new RecDieRoller();
		rollATwo.roll();

		/** Tester: Runs roll class 1000 times, recording 
		 *  number of times to get a 2 each time. */
		int roller = 1000, countHolder = 0;
		for (int i = 0; i < roller; i++) {
			rollATwo.roll();
			countHolder += rollATwo.getCount();
			rollATwo.setCount(0);
		}//end for loop
		
		/** Printing mean number of die rolls to get a 2. */ 
		double rollAvg = (double)countHolder/1000;
		System.out.println("Average number of rolls for a 2: " + Math.round(rollAvg));
	}//end main

}//end class
