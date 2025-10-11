package Getting_Started;

public class Armstrong_number {
    public static void main(String[] args) {
        int n=153;
        int l=order(n);

        if(arm(n,l)==n)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }

    }
    static int order (int x)
    {
        int l=0;
        while(x>0)
        {
            l++;
            x=x/10;
        }
        return l;
    }
    static int arm(int n, int l)
    {   int rem=0,arm=0;
        while(n>0)
        {
            rem=n%10;
            arm=arm+(int)Math.pow(rem,l);
            n=n/10;
        }
        return arm;
    }
}
