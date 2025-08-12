package array;

import java.util.Arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		// Third largest element in the given array
		int[] a = { 4, 5, 3, 1, 6 };
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		System.out.println("Given arrays is: " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			if(a[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = a[i];
			} else if(a[i] > secondMax && a[i] != firstMax) {
				thirdMax = secondMax;
				thirdMax = secondMax;
				secondMax = a[i];
			} else if(a[i] > thirdMax && a[i] != secondMax && a[i] != firstMax) {
				thirdMax = a[i];
			}
		}
		System.out.println("First max is: " + firstMax);
		System.out.println("Second max is: " + secondMax);
		System.out.println("Second max is: " + thirdMax);
	}

}
