public class InstanceMethodInJava{
	//Method Here
	public static void main(String[] args){
		InstanceMethodInJava instanceMethod = new InstanceMethodInJava();
		int sum = instanceMethod.add(70,50,80);
		
		System.out.printf("The sum of all numbers is %d%n",sum);
		
		sum = instanceMethod.add(90,40,30);
		System.out.printf("The sum of all the numbers is %d%n",sum);
		
		
		instanceMethod.details(21, "Katie Perry");
		
		instanceMethod.details(79, "Ethan Hunt");
		
		instanceMethod.details(50, "Utomi Von Schneidder");
	}
	public int add(int num1, int num2, int num3){
		
		int sum = num1 + num2 + num3;
		return sum;
	}
	public void details(int age , String name){
		System.out.printf("Your name is %s%n",name);
		System.out.printf("You are %d years old %n",age);
	}
}