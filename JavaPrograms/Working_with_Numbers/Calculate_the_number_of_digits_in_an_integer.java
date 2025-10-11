package Working_with_Numbers;

public class Calculate_the_number_of_digits_in_an_integer {
    public static void main(String[] args) {
        int n=2090111,num=0;
        while(n>0)
        {
            
            num++;
            n=n/10;
        }
        System.out.println(num);
    }
}
