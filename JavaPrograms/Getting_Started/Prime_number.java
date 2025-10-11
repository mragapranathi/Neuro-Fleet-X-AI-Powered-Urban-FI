package Getting_Started;

public class Prime_number {
    public static void main(String[] args) {
        int n=19,i;
        int flag=0;
        for( i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }

    }
}
