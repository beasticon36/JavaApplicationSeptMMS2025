import java.util.Arrays;

public class ArrayClass{
	public static void main(String[] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,6,9};
		int[] b = {7,6,9};
		
		int[] c = {7,6,9};
		int[] d = {7,6,9};
		
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("Binary Search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("The index number of 9 is %d%n", index);

		
		boolean isEqualAB = Arrays.equals(a, b);
		System.out.printf("The result is %b%n", isEqualAB);
		
		boolean isEqualCD = Arrays.equals(c, d);
		System.out.printf("The result is %b%n", isEqualCD);
	}
}