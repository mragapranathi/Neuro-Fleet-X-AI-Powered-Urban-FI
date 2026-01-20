package Working_with_Numbers;

public class Finding_number_of_integers_which_has_exactly_x_divisors {
    public static void main(String[] args) {
        int n=20,x=2,c=0;
        for(int i=1;i<=n;i++)
        {   int count=0;
            for(int j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==x)
            {
                c++;
                
            }
        }
        System.out.println(c);
    }
}
