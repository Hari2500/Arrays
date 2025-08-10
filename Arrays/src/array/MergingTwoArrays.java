package array;

import java.util.Arrays;

public class MergingTwoArrays {

	static int[] merge(int[] a, int[] b) {
		int[] res = new int[a.length + b.length];
		int m = 0, n = 0;
		for (int i = 0; i < res.length; i++) {
			if(m<a.length) {
				res[i] = a[m++];
			} else if(n<b.length) {
				res[i] = b[n++];
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// Merge the two given array to single array
		int[] a = { 4, 5, 6, 7 };
		int[] b = { 8, 9, 10, 11 };

		int[] res = merge(a, b);
		
		System.out.println(Arrays.toString(res));
	}

}
