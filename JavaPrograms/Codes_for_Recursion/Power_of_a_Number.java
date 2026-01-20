package Codes_for_Recursion;

public class Power_of_a_Number {
    public static void main(String[] args) {
        int base=5, e=3;
        System.out.println(cal(base,e));
    }
    
    static int cal(int b, int e)
    {
        if(e==0)
        {
            return 1;
        }
        return (b*cal(b,e-1));
    }
}
