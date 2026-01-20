package Working_with_Numbers;

public class Decimal_to_Binary_conversion {
    public static void main(String[] args) {
        
    
    int n=21;
        String s="";
    while(n>0)
    {
        int rem=n%2;
       
        s=Integer.toString(rem)+s;
        n=n/2;

    }
    
    
    System.out.println(s);
}
}

