package Getting_Started;

public class Perfect_number {
    public static void main(String[] args) {
        int n=6,p=0;
        int t=n;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                p=p+i;
               
            }
        }
        if(t==p)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
    
}
