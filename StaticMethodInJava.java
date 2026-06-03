public class StaticMethodInJava{
	//Method Here
	public static void main(String[] args){
		int sum = add(70,50,80);
		
		System.out.printf("The sum of all numbers is %d%n",sum);
		
		sum = add(90,40,30);
		System.out.printf("The sum of all the numbers is %d%n",sum);
		
		
		details(21, "Katie Perry");
		
		details(79, "Ethan Hunt");
		
		details(50, "Utomi Von Schneidder");
	}
	public static int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	public static void details(int age , String name){
		System.out.printf("Your name is %s%n",name);
		System.out.printf("You are %d years old %n",age);
	}
}