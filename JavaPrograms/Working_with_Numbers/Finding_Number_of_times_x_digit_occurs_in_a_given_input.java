package Working_with_Numbers;

public class Finding_Number_of_times_x_digit_occurs_in_a_given_input {
    public static void main(String[] args) {
        int n=890190798,x=9,c=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==x)
            {
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
