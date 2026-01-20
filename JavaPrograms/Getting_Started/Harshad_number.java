package Getting_Started;

public class Harshad_number {
    public static void main(String[] args) {
        int n=21;
        int rem=0,r=0,t=n;
        while(n>0)
        {
            rem=n%10;
            r=r+rem;
            n=n/10;
        }
        if(t%r==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}
