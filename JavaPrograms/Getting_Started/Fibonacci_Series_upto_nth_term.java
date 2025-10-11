package Getting_Started;

public class Fibonacci_Series_upto_nth_term {
    public static void main(String[] args) {
        int n=4;
        int a=0,b=1;
        System.out.print(a+","+b);
        int next;
        for(int i=2;i<n;i++)
        {
            next=a+b;
            a=b;
            b=next;
            System.out.print(","+next);
        }
    }
}

