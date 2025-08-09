package array;

import java.util.Arrays;

public class ReversingGivenArray {
	
	static void rev(int [] n) {
		int l = 0, r = n.length-1;
		while(l<r) {
			int temp = n[l];
			n[l] = n[r];
			n[r] = temp;
			l++;
			r--;
		}
	}
	
	static void revOrder(int [] n) {
		for(int i = n.length-1; i>=0; i--) {
			System.out.print(n[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println("Given array: " + Arrays.toString(a));
		System.out.print("Reverse printed array: ");
		revOrder(a);
		System.out.println();
		rev(a);
		System.out.println("Reversed Array: " + Arrays.toString(a));
	}
}
