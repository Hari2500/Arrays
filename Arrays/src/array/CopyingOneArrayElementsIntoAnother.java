package array;

import java.util.Arrays;

public class CopyingOneArrayElementsIntoAnother {
	static void copy(int[] a) {
		int [] copy = new int[a.length];
		
		for(int i = 1; i<a.length;i++) {
			copy[i] = a[i];
		}
		System.out.println("Copy: "+Arrays.toString(a));
	}

	public static void main(String[] args) {
		// Copy array
		int [] original = {2,3,4,5,6};
		System.out.println("Original: " + Arrays.toString(original));
		copy(original);
	}

}
