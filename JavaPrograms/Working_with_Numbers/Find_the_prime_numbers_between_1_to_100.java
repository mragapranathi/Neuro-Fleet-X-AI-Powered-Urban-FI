package Working_with_Numbers;

public class Find_the_prime_numbers_between_1_to_100 {
    public static void main(String[] args) {
        for (int n=2;n<100;n++)
        {
            int flag=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n);
            }
        }
    }
}
