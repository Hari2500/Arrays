package array;

import java.util.Arrays;

public class AddingEvenTwoDigit {

	static int isEven(int num) {
		int ori = num;
		int sum = 0;
		if (num % 2 == 0) {
			while (num != 0) {
				int last = num % 10;
				sum += last;
				num /= 10;
			}
			return sum;
		} else {
			return ori;
		}
	}

	public static void main(String[] args) {
		// Adding the even Elements in the array
		int[] a = { 123, 24, 17, 13, 18 };

		for (int i = 0; i < a.length; i++) {
			a[i] = isEven(a[i]);
		}

		System.out.println(Arrays.toString(a));

	}

}
