package junitdemo;

/**
 * Calculator class providing basic arithmetic operations.
 * This class is designed to demonstrate JUnit testing practices.
 * 
 * @author Ketan Mishra
 * @version 1.0
 */
public class Calculator {
	
	/**
	 * Adds two integers and returns the result.
	 * 
	 * @param a first integer
	 * @param b second integer
	 * @return sum of a and b
	 */
	public int sum(int a, int b) {
		return a + b;
	}
	
	/**
	 * Subtracts second integer from first integer.
	 * 
	 * @param a first integer (minuend)
	 * @param b second integer (subtrahend)
	 * @return difference (a - b)
	 */
	public int subtract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplies two integers and returns the result.
	 * 
	 * @param a first integer
	 * @param b second integer
	 * @return product of a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
}
