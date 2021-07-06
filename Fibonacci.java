import java.util.Scanner;
class Fibonaci
{
	public static void main(String[] args)
	{
		myclass f;
		f=new myclass();
		f.fibonacci();
	}
}
class myclass
{
	public static void fibonacci()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		n=sc.nextInt();
		int i=0,j=1,nextTerm;
		System.out.println(" The Fibonacci series is ");
		for(int c=0;c<n;c++)
		{
			if(c<=1)
				nextTerm=c;
			else
			{
				nextTerm=i+j;
				i=j;
				j=nextTerm;
			}
			System.out.println(nextTerm);
		}
	}
}
		