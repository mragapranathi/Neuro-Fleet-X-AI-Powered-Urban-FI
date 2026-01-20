import java.util.Scanner;

public class IfElse 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd");
		int n = sc.nextInt();
		System.out.println("Using if-else Loop");
		if(n%2 == 0)
		{
			System.out.println(n+" is Even Number.");
		
		}
		else
		{
			System.out.println(n+" is Odd Number.");
		}

	}

}
