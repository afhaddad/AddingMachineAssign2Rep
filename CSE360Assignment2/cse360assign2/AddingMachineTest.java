package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

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
