package Working_with_Numbers;

public class Decimal_to_Octal_Conversion {
    public static void main(String[] args) {
        int n=148;
        String s="";
        while(n>0)
        {
            int rem=n%8;
            s=Integer.toString(rem)+s;
            n=n/8;
        }
        System.out.println(s);
    }
}
