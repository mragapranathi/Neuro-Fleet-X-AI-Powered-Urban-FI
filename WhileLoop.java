import java.util.Scanner;

public class WhileLoop 
{

	public static void main(String[] args) 
	{
		System.out.println("To find the Factorial of a given number.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int i=1;
		int fact = 1;
		while(i<=n)
		{
			fact *=i;
			i++;
		}
		System.out.println(fact+" is the factorial of "+n);
	}

}
