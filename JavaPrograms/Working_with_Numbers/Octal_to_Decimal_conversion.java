package Working_with_Numbers;

public class Octal_to_Decimal_conversion {
    public static void main(String[] args) {
        int n=653,rem=0,r=0,count=0;
        while(n>0)
        {
            
            rem=n%10;
            r=r+(int)Math.pow(8,count)*rem;
            count++;
            n=n/10;
        }
        System.out.println(r);
    }
}
