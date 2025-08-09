package array;

import java.util.Arrays;

public class ConvertingCharToAscii {

	public static void main(String[] args) {
		// Converting Char to Ascii
			char [] c = {'A','B','C','D'};
			int [] a = new int[c.length];
			
			System.out.println("Character: " + Arrays.toString(c));
			
			for(int i = 0; i< c.length;i++){
				int Ascii = (int)c[i];
				a[i] = Ascii;
			}
			
			System.out.println("Ascii: " + Arrays.toString(a));
	}

}
