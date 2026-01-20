package Working_with_Numbers;

public class Addition_of_two_fractions {
    public static void main(String[] args) {
        int x1=3,x2=4,y1=5,y2=6;
        int d=x2*y2;
        int num=(y2*x1)+(x2*y1);
        //int sol=num/d;
        int big=(num>d)?num:d;
        for(int i=big;i>0;i--)
        {
            if(num%i==0 && d%i==0)
            {
                num=num/i;
                d=d/i;
            }
            
        }
        System.out.println(num+"/"+d);
    }
}
