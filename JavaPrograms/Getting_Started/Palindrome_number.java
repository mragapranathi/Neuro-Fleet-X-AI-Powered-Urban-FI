package Getting_Started;

public class Palindrome_number {
    public static void main(String[] args) {
        int n=123321,r=0,rem;
        int s=n;
        while(n>0)
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        if(s==r)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }

    }
}
