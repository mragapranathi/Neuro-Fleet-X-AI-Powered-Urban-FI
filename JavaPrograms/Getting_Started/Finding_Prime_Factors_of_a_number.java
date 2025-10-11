package Getting_Started;

public class Finding_Prime_Factors_of_a_number {
    public static void main(String[] args) {
        int n=24;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }
        }
    }
}
