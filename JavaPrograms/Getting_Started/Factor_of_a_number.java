package Getting_Started;

public class Factor_of_a_number {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
