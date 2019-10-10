/**
 * Albert Haddad
 * 1213104332 Seat#RA3
 * Class ID 85141
 * Assignment 2
 */
package cse360assign2;

/**
 * Adding Machine is designed to be a very simple calculator that can add and subtract values.
 * It also keeps a history of the values entered through this class.
 * @author Albert Haddad
 *
 */
public class AddingMachine 
{
	private int total;	//keeps the running total of the values entered into the machine.
	private String history = "0";	//The string that keeps track of the history of transactions.
	
	/**
	 * UNUSED AT THE MOMENT
	 */
	public AddingMachine () 
	{
	}
	
	/**
	 * Returns the running total of the machine at the time called.
	 * @return The running total
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds the parameter entered to the running total. Also adds to the history string
	 * what transaction was done.
	 * @param value - The number entered to be added
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts the parameter entered from the running total. Also adds to the history string
	 * what transaction was done.
	 * @param value - The number entered to be subtracted
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
		
	/**
	 * Returns as a string value the history of transactions done with the machine.
	 */
	public String toString () 
	{
		return history;
	}
	
	/**
	 * Clears all data from the machine. Resets everything back to 0.
	 */
	public void clear() 
	{
		history = "0";
		total = 0;
	}
}
