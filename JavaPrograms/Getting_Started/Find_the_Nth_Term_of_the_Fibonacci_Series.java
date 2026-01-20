package Getting_Started;

public class Find_the_Nth_Term_of_the_Fibonacci_Series {
    public static void main(String[] args) {
        int n=6;
        int a=0,b=1,next=0;
        for(int i=2;i<=n;i++)
        {
            next=a+b;
            a=b;
            b=next;
        }
        System.out.println(n+"th fibonacci number :"+next);
    }
}
