import java.util.Scanner;

public class IfLoop 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter 2 number to check biggest number using if-loop");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int a = sc.nextInt();
		System.out.println("Enter Secound number : ");
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println(a+" is Bigger than "+b);
		}
		if(b>a)
		{
			System.out.println(b+" is Bigger than "+a);
		}
		
	}

}
