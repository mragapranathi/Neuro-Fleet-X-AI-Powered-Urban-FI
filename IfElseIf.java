import java.util.Scanner;

public class IfElseIf 
{

	public static void main(String[] args) 
	{
		System.out.println("To Calculate whether the given year is Leap Year or not using if else-if Loop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		if(year%400 == 0)
		{
			System.out.println(year+" is a Leap Year.");
		}
		else if(year%100 == 0)
		{
			System.out.println(year+" is a not a Leap Year.");
		}
		else if(year%4==0)
		{
			System.out.println(year+" is a Leap Year.");
		}
		else
		{
			System.out.println(year+" is a not a Leap Year.");
		}

	}

}
