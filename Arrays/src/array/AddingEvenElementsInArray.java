package array;

public class AddingEvenElementsInArray {
	
	static void addingEven(int [] b) {
		
		int add = 0;
		for(int i = 0; i<b.length;i++) {
			if(b[i]%2 ==0)
				add+=b[i];
		}
		System.out.println("Sum of even elements in the array is: "+add);
	}

	public static void main(String[] args) {
		// Adding Even Elements
		
		int [] a = {1,2,3,4,5};
		addingEven(a);

	}

}
