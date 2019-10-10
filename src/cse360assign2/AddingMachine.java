/**
 * @author Amodini Pathak
 * @version 1.0, 9 Oct. 2019
 * Arizona State University
 * CSE 360: Intro to Software Engineering (Friday Section)
 * Assignment 2
 *  
 * AddingMachine.java defines the AddingMachine class which contains
 * methods to add to and subtract from a total which can be viewed along
 * with a complete history of all additions/subtractions performed on the
 * total.
 */
package cse360assign2;

/**
 * AddingMachine class is a public class whose objects consist of an int {@link #total}
 * which can be modified using methods to {@link #add(int)} to or {@link #subtract(int)} from the total. 
 * The total can be viewed along with a complete history of operations performed
 * on it. 
 * 
 * @author Amodini Pathak
 */
public class AddingMachine {

	/**
	 * Private instance variable for the current total value
	 */
	private int total;
	
	/**
	 * Default constructor to create an AddingMachine object with
	 * its total initialized to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Accessor method for the {@link #total} 
	 * 
	 * @return the current int value of the total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Method to add an int value to the total.
	 * 
	 * @param value the int value to be added to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Method to subtract an int value from the total
	 * 
	 * @param value the int value to be subtracted from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Method to return a String representation of the object in the form
	 * of a complete history of operations performed on the total.
	 * 
	 * @return String representation of the object
	 */
	public String toString () {
		return "";
	}

	/**
	 * Method to clear the object by resetting the total to 0
	 * and clearing the history of operations.
	 */
	public void clear() {
	
	}
}
