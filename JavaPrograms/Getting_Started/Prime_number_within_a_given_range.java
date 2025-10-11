package Getting_Started;

public class Prime_number_within_a_given_range {
    public static void main(String[] args) {
       
        int n=1,m=10;
        for(int i=n;i<=m;i++)
        {
            int flag=0;
            for(int k=2;k<i;k++)
            {
                
                if(i%k==0)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
