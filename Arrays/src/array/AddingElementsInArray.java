package array;

import java.util.Arrays;

public class AddingElementsInArray {

	public static void main(String[] args) {
		// Adding elements in array
		
		int [] a = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum += a[i];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("The sum of the given array is: " + sum);

	}

}
