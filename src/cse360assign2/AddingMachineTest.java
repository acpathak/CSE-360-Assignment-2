/**
 * @author Amodini Pathak
 * @version 1.0, 9 Oct. 2019
 * Arizona State University
 * CSE 360: Intro to Software Engineering (Friday Section)
 * Assignment 2
 *  
 * AddingMachineTest.java defines the AddingMachineTest class which contains
 * methods to test the AddingMachine class.
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * AddingMachineTest class is a public class to test the AddingMachine class
 * by using test methods to test each method of the AddingMachine class.
 * 
 * @author Amodini Pathak
 */
class AddingMachineTest {

	/**
	 * Method to test AddingMachine's add method
	 */
	@Test
	void testAdd() {
		AddingMachine test0 = new AddingMachine();
		assertEquals(0, test0.getTotal());
		
		AddingMachine test1 = new AddingMachine();
		test1.add(2);
		assertEquals(2, test1.getTotal());
		
		AddingMachine test2 = new AddingMachine();
		test2.add(7);
		test2.add(11);
		test2.add(500);
		assertEquals(518, test2.getTotal());
	}
	
	/**
	 * Method to test AddingMachine's subtract method
	 */
	@Test
	void testSubtract() {
		AddingMachine test3 = new AddingMachine();
		test3.subtract(57);
		assertEquals(-57, test3.getTotal());
		
		AddingMachine test4 = new AddingMachine();
		test4.add(10);
		test4.subtract(1);
		test4.subtract(2);
		test4.subtract(3);
		assertEquals(4, test4.getTotal());
	}
	
	/**
	 * Method to test AddingMachine's toString method
	 */
	@Test
	void testToString() {
		AddingMachine test5 = new AddingMachine();
		assertEquals("0", test5.toString());
		
		AddingMachine test6 = new AddingMachine();
		test6.subtract(1);
		test6.add(2);
		assertEquals("0 - 1 + 2", test6.toString());
		
		AddingMachine test7 = new AddingMachine();
		test7.add(7);
		test7.subtract(4);
		test7.add(-88);
		test7.subtract(-99);
		assertEquals("0 + 7 - 4 + -88 - -99", test7.toString());
	}

	/**
	 * Method to test AddingMachine's clear method
	 */
	@Test
	void testClear() {
		AddingMachine test8 = new AddingMachine();
		test8.subtract(15);
		test8.add(7);
		test8.clear();
		assertEquals("0", test8.toString());
		
		AddingMachine test9 = new AddingMachine();
		test9.add(78);
		test9.subtract(14);
		test9.add(-2);
		test9.subtract(-5);
		test9.clear();
		assertEquals("0", test9.toString());
	}
}
