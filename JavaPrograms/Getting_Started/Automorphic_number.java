package Getting_Started;
public class Automorphic_number {
    public static void main(String[] args) {
        double n=890625;
        double sq=n*n;
        double t=n,l=0;
        double temp=sq;
        double r=0,rem=0;
        while(n>0)
        {
            l++;
            n=n/10;
        }
        n=t;
        double count=l;
        while(l>0)
        {

            rem=sq%10;
            r=r*10+rem;
            sq=sq/10;
            l--;
        }
        l=count;
        sq=temp;
        double r1=0,r2=0,rem1=0,rem2=0;
        while(l>0)
        {
            rem1=sq%10;
            rem2=n%10;
            r1=r1*10+rem1;
            r2=r2*10+rem2;
            sq=sq/10;
            n=n/10;
            l--;

        }
        if(r1==r2)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}
