package array;

import java.util.Arrays;

public class SumOfPrimeNumbersInArray {

	static boolean isPrime(int num) {

		if (num < 2)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// Sum of prime numbers
		int[] given = { 4, 5, 2, 6, 8, 7, 11 };

		int sum = 0;
		for (int i = 0; i < given.length; i++) {
			if (isPrime(given[i])) {
				sum += given[i];
			}
		}
		System.out.println(Arrays.toString(given));
		System.out.println("Sum of prime numbers is: " + sum);
	}

}
