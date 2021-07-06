import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		myclass f;
		f=new myclass();
		f.factorial();
	}
}
class myclass
{
	public static void factorial()
	{
		int i,f=1,number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value : ");
		number = scanner.nextInt();
		for(i=1;i<=number;i++)
		{
		f=f*i;
		}
		System.out.println("Factorial of "+number+" is: "+f);
	}
}