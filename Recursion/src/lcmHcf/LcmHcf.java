package lcmHcf;
/**
 * @author vrinda
 *
 */
public class LcmHcf {
	/**
	 * uses recursion to solve LCM of two numbers
	 * 
	 * @param num1 first integer
	 * @param num2 second integer
	 * @return LCM of first and second integer
	 */
	public static int getLcm(int num1, int num2) {
		if (num1 == num2) {
			return num1;
		}
		int smallNum = num1 < num2 ? num1 : num2;
		int bigNum = num1 < num2 ? num2 : num1;
		// base case
		if (smallNum == 1) {
			return bigNum;
		}
		int fact; // store the factors
		boolean flag = false;
		for (fact = 2; fact <= bigNum; fact++) {
			if (smallNum % fact == 0) {
				smallNum /= fact;
				flag = true;
			}
			if (bigNum % fact == 0) {
				bigNum /= fact;
				flag = true;
			}
			if (flag) {
				break;
			}
		}
		// recursion call
		return fact * getLcm(smallNum, bigNum);
	}

	/**
	 * uses recursion to get HCF of two numbers (Euclidean theorem)
	 * 
	 * @param num1 first integer
	 * @param num2 second integer
	 * @return HCF of first and second integer
	 */
	public static int getHcf(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return getHcf(num2, num1 % num2);
	}
}