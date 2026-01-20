package Working_with_Numbers;

public class Lowest_Common_Multiple_LCM {
    public static void main(String[] args) {
        int a=3,b=6;
        int lcm=1;
        int big=(a>b)?a:b;
        for(int i=big;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
        
    }
}
