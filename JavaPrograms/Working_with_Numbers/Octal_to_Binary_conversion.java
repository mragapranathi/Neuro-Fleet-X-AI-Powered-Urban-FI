package Working_with_Numbers;

public class Octal_to_Binary_conversion {
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
        n=r;
        String s="";
    while(n>0)
    {
         rem=n%2;
       
        s=Integer.toString(rem)+s;
        n=n/2;

    }
    }
}
