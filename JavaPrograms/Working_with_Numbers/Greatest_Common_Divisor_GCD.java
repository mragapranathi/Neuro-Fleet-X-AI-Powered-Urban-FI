package Working_with_Numbers;

public class Greatest_Common_Divisor_GCD {
    public static void main(String[] args) {
        int a=18,b=12,gcd=1;
        int big =(a>b)?a:b;
        for(int i=big;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
