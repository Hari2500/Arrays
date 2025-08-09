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

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		rev(a);
		System.out.println(Arrays.toString(a));	
	}
}
