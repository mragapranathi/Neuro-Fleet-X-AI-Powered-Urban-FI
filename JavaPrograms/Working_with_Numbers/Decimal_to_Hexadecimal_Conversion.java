package Working_with_Numbers;

public class Decimal_to_Hexadecimal_Conversion {
    public static void main(String[] args) {
        int n=1457;
        String s="";
        while(n>0)
        {   String d="0123456789ABCDEF";
            int rem=n%16;
            if(rem<10)
            {
                s=Integer.toString(rem)+s;
            }
            else
            {
                char val=d.charAt(rem);
                s=val+s;
            }
            n=n/16;
        }
        System.out.println(s);
    }
}
