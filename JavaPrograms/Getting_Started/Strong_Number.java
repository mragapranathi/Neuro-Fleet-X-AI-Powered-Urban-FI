package Getting_Started;

public class Strong_Number {
    public static void main(String[] args) {
        int n=145;
        int t=n,rem=0,st=0;
        while(n>0)
        {
            rem=n%10;
            st=st+fact(rem);
            n=n/10;
        }
        if(t==st)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

}
