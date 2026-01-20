package Getting_Started;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        int n=4567,r=0,rem;
        while(n>0)
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        System.out.println(r);
    }
}
