package Working_with_Numbers;
public class Highest_Common_Factor_HCF {
    public static void main(String[] args) {
        int a=0,b=6,hcf=1;
        if(a==0 || b==0)
        {
            if(a==0)
            hcf=b;
            else
            hcf=a;
        }
        for(int i=a;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
                break;
            }
        }
        System.out.println(hcf);
    }
}
