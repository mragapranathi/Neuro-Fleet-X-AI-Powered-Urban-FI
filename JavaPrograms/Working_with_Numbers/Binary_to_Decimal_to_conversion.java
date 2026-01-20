package Working_with_Numbers;

public class Binary_to_Decimal_to_conversion {
    public static void main(String[] args) {
        int n=101,rem=0,d=0,c=0;
        while(n>0)
        {   
            rem=n%10;
            if(rem==1)
            {
            d=d+(int)Math.pow(2,c);
            }
            c=c+1;
            n=n/10;
        }
        System.out.println(d);
    }
}
