package Getting_Started;

public class Greatest_of_the_Three_numbers {
    public static void main(String[] args) {
        int a=8,b=1,c=4;
        int big=(a>b&&a>c)?a:((b>c)?b:c);
        System.out.println(big);
    }
}
