package Getting_Started;

public class Leap_year_or_not {
    public static void main(String[] args) {
        int y=2020;
        if(y%100==0)
        {
            if(y%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not a Leap Year");
            }
        }
        else if(y%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
