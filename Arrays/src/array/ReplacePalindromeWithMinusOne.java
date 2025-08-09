package array;

import java.util.Arrays;

public class ReplacePalindromeWithMinusOne {

	static boolean palindromeCheck(int a) {
		int ori = a, rev = 0;
		while(a!=0) {
			int rem = a%10;
			rev = rev*10 + rem;
			a/=10;
		}
		return ori == rev;
	}

	public static void main(String[] args) {
		// Replace Palindrome With -1 in the given array
		int[] given = { 84, 33, 42, 43, 22 };
		for (int i = 0; i < given.length; i++) {
			if(palindromeCheck(given[i]))
				given[i] = -1;
		}
		System.out.print("Output [");
		for(int i = 0; i<given.length;i++) {
			System.out.print(given[i]);
			if(i<given.length-1)
				System.out.print(", ");
		}
		System.out.print("]\n");
		System.out.println(Arrays.toString(given));
	}

}
