public class MethodInJava{
	//Method Here
	public static void main(String[] args){
		MethodInJava javaMethod = new MethodInJava();
		int sum = javaMethod.add(70,50,80);
		
		System.out.printf("The sum of all numbers in %d%n",sum);
	}
	public int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
}