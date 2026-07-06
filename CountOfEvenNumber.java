public class CountOfEvenNumber{
	public static void main(String[] args){
		int[] numbers = {6,9,5,12,4,8,5,2,16,14};
		int evenCount = 0;
		
		for (int num : numbers){
			if (num % 2 == 0){
				evenCount++;
			}
		}
		System.out.printf("Count of even numbers: %d%n",evenCount);
	}
}