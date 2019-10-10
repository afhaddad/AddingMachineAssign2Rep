/**
 * Albert Haddad
 * 1213104332 Seat#RA3
 * Class ID 85141
 * Assignment 2
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This Class tests the various features of the adding machine by running several calculations and
 * analyzing the end result
 * @author Albert Haddad
 *
 */
class AddingMachineTest {

	/**
	 * Testing each function of the adding machine class
	 */
	@Test
	void test() 
	{
		String hist;
		AddingMachine am = new AddingMachine();
		am.add(5);
		am.subtract(4);
		am.clear();
		hist = am.toString();
		System.out.println(hist);
		assertEquals("0", hist);
	}

}
