package Working_with_Numbers;

public class Replace_all_0s_with_1_in_a_given_integer {
    public static void main(String[] args) {
        int n=900120678;

        while(n>0)
        {
            int rem=n%10;
            if(rem==0)
            {
                rem=1;

            }
            
            n=n/10;
            n=n*10+rem;
            
        }
        System.out.println(n);
    }
}
