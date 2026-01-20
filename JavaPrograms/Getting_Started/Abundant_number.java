package Getting_Started;

public class Abundant_number {
    public static void main(String[] args) {
        int n=12;
        int t=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                t=t+i;
            }
        }
        
        if(t>n)
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("Not an Abundant Number");
        }
    }
}
