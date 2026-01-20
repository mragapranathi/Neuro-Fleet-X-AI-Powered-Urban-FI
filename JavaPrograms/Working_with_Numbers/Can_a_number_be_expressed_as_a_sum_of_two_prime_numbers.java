package Working_with_Numbers;

public class Can_a_number_be_expressed_as_a_sum_of_two_prime_numbers {
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>n/2;i--)
        {
            int s=n-i;
            int flag=0,flag1=0;
            for(int j=1;j<=s;j++)
            {
                if(s%j==0)
                {
                    flag++;
                    
                }
                
            }
            for(int a=1;a<=i;a++)
            {
                if(i%a==0)
                {
                    flag1++;
                    
                }
                
            }
            if(flag==2 && flag1==2)
            {
                System.out.println(s+" + "+i);
            }
        }

    }
}
