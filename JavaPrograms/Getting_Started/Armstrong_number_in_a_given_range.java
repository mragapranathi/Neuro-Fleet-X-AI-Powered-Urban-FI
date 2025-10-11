package Getting_Started;

public class Armstrong_number_in_a_given_range {
    public static void main(String[] args) {
        int a=10,b=10000;
        for(int p=a;p<=b;p++)
        {
            int l=order(p);
            int arm=arm(p,l);
            if(arm==p)
            {
                System.out.println(p);
            }
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
