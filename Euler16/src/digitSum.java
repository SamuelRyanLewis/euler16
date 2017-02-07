/**
 * 
 * @author Sam
 * Project Euler 16
 * 2^15 = 32768 and the sum of its digits is 3+2+7+6+8=26.
 * What is the sum of the digits of the number 2^1000?
 */

import java.math.BigInteger;

public class digitSum {

	/**
	 * Sums the digits of a BigInteger argument myInt.
	 * @param myInt
	 * @return sum of digits of myInt
	 */
	private static BigInteger bigDigitSum (BigInteger myInt) {
		BigInteger total = BigInteger.valueOf(0);
		while (myInt.signum() == 1) {
			total = total.add(myInt.remainder(BigInteger.valueOf(10)));
			myInt = myInt.divide(BigInteger.valueOf(10));
		}
		return total;
	}
	public static void main(String[] args) {
		BigInteger myInt = BigInteger.valueOf(2).pow(1000);
		System.out.println(myInt);
		System.out.println("Sum of digits = " + bigDigitSum(myInt));
	}

}
