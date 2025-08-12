package array;

import java.util.Arrays;

public class FindingThirdMinimum {
	
	public static int thirdMinimum(int [] a) {
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		
		if(a.length < 3) {
			System.out.println("Array should contain more than three values.");
		} else {
			for(int num : a) {
				if(num < first) {
					third = second;
					second = first;
					first = num;
				} else if(num < second && first != num) {
					third = second;
					second = num;
				} else if(num < third && num!= second && num != first) {
					third = num;
				}
			}
		}
		return third;
	}

	public static void main(String[] args) {
		// Finding Third Minimum
		int [] a = {4,5,6,7,8};
		
		System.out.println("Given array: " + Arrays.toString(a));
		
		System.out.println("Third minimum arrays is: " + thirdMinimum(a));
 	}

}
