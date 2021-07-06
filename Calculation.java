import java.util.Scanner;
public class Calculation
{
	public static void main(String args[])
	{
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st Numbers : ");
		a = scanner.nextInt();
		System.out.print("Enter 2nd Numbers : ");
		b = scanner.nextInt();
		sum(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);	
	}
	static void sum(int a, int b)
	{
		int add;
		add = a + b;
		System.out.println("Sum = " + add);
	}
	static void sub(int a, int b)
	{
		int subtract;
		subtract = a - b;
		System.out.println("Difference = " + subtract);
	}
	static void mul(int a, int b)
	{
		int multiply;
		multiply = a * b;
		System.out.println("Multiplication = " + multiply);
	}
	static void div(int a, int b)
	{
		float divide;
		divide = (float) a / b;;
		System.out.println("Division = " + divide);
	}
}