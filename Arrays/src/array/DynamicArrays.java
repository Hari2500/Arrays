package array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays {

	public static void main(String[] args) {
		// Creating array in Dynamic way
		Scanner sc = new Scanner(System.in);
		
		//Getting the array size from the user
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		//Declaration and initialization
		String [] s = new String[size];
		
		for(int j = 0; j<s.length; j++) {
			System.out.print("Enter string values: ");
			s[j] = sc.next();
		}
		
		System.out.println(Arrays.toString(s));
		
		//Declaration
		int[] a;
		//Initialization
		a = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter integer values: ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));

		sc.close();
	}

}
