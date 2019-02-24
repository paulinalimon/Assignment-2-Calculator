package cse360assign2;
/**
 * 
 * Name: Paulina Limon
 * Class ID: 456
 * Assignment Number: 2
 * 
 * Calculator
 * This class defines a calculator that takes values and calculates
 * them into the integer total. 
 * The user will be able to do the basic arithmetic (such as adding,
 * subtracting, multiplying or dividing) to a total number. 
 * Additionally will be able to see the result of all the calculations
 * or get the history of all the actions done to the calcultor.
 *
 */

public class Calculator {

	private int total;
	/**
	 * Class constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * 
	 * getTotal returns the total integer after all the 
	 * calculations done before calling it.
	 */
	public int getTotal () {
		return total;
	}
	
	
	/**
	 * Adds the parameter to the total variable.
	 * @param value: number given by the user to add.
	 */
	public void add (int value) {
		total = total + value;
	}
	
	
	/**
	 * Subtracts the parameter from the total variable.
	 * @param value: number given by the user to subtract.
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	
	/**
	 * Multiplies the total by the parameter.
	 * @param value: number given by the user to multiply.
	 */
	public void multiply (int value) {
		total = value * total;
	}
	
	
	/**
	 * Divides the total by the parameter.
	 * @param value: number given by the user to divide.
	 * If the number is zero, it sets the total equal to zero
	 * in order to avoid any exceptions displayed.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total = total / value;
		}
	}
	
	
	/**
	 * getHistory returns the actions done by the user.
	 */
	public String getHistory () {
		return "";
	}
}