public class VariableLengthArgument{
	public static void main(String[] args){
		System.out.printf("The sum is %d%n", sum(5,4,3,2,1,3,6));
		System.out.printf("The sum is %d%n", sum(5,4,3,2,1,3));
		System.out.printf("The sum is %d%n", sum(5,4,3,2,1));
		System.out.printf("The sum is %d%n", sum(5,4,3,2));
		System.out.printf("The sum is %d%n", sum(5,4,3));
		System.out.printf("The sum is %d%n", sum(5,4));
		System.out.printf("The sum is %d%n", sum(5));
	}
	
	public static int sum(int... numbers){
		int sum = 0;
		for(int x : numbers){
			sum += x;
		}
		
		return sum;
	}
}