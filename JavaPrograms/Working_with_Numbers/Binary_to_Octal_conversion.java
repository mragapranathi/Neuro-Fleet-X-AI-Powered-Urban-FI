package Working_with_Numbers;

public class Binary_to_Octal_conversion {
    public static void main(String[] args) {
        int n=1010,rem=0,d=0,c=0;
        String s="";
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
        n=d;
        while (n>0) {
            rem=n%8;
            
            s=Integer.toString(rem)+s;
            n=n/8;
            
        }


        System.out.println(s);
    }
}
