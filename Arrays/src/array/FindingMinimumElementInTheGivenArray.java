package array;

import java.util.Arrays;

public class FindingMinimumElementInTheGivenArray {

	static void smallestArray(int[] a) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("The smallest element in the given array is: " + min);
	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 3, 7 };
		System.out.println("Given array is: " + Arrays.toString(a));
		smallestArray(a);
	}

}
