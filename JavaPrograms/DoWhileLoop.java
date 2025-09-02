import java.util.Scanner;

public class DoWhileLoop 
{

	public static void main(String[] args) 
	{
		System.out.println("To print numbers from 1 to the given number using do-while loop");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i=1;
		do 
		{
			System.out.print(i+"  ");
			i++;
		}while(i<=n);
		
	}

}
