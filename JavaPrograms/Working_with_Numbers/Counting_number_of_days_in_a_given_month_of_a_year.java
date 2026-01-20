package Working_with_Numbers;

public class Counting_number_of_days_in_a_given_month_of_a_year {
    public static void main(String[] args) {
        int m=12,y=2012;
        switch(m)
        {
            case 1: System.out.println(31);
                break;
            case 2: if(y%100==0)
                    {
                        if(y%400==0)
                        {
                            System.out.println(29);
                        }
                        else{
                            System.out.println(28);
                        }
                    }
                    else if(y%4==0){
                        System.out.println(29);
                    }
                    else
                    {
                        System.out.println(28);
                    }
                break;
            case 3: System.out.println(31);
                break;
            case 4: System.out.println(30);
                break;
            case 5: System.out.println(31);
                break;
            case 6: System.out.println(30);
                break;
            case 7: System.out.println(31);
                break;
            case 8: System.out.println(31);
                break;
            case 9: System.out.println(30);
                break;
            case 10: System.out.println(31);
                break;
            case 11: System.out.println(30);
                break;
            case 12: System.out.println(31);
                break;
            default:
                    System.out.println("Invalid Request");
        }
    }
}
