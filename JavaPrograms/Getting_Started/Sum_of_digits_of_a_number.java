package Getting_Started;

public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {
        int n=231456,rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
