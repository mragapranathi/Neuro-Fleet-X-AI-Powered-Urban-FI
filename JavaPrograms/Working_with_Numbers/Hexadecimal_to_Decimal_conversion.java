package Working_with_Numbers;

public class Hexadecimal_to_Decimal_conversion {
    public static void main(String[] args) {
       String hex= "C9";
       System.out.println(convert(hex));
    }

    static int convert(String hex)
    {
        String digits = "0123456789ABCDEF";
        int value=0;
        for (int i=0;i<hex.length();i++)
        {
            char c=hex.charAt(i);
            int d=digits.indexOf(c);
            value=value*16+d;
        }
        return value;
    }
   
}
