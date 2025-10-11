package Working_with_Numbers;

public class Count_possible_decoding_of_a_given_digit_sequence {
    public static void main(String[] args) {
        int n=131;
        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String o="";
        while(n>0)
        {
            int rem=n%10;
            o=a.charAt(rem-1)+o;
            n=n/10;
        }
        System.out.println(o);
    }
}
