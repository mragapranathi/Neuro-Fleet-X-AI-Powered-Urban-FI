package Getting_Started;

public class Friendly_pair {
    public static void main(String[] args) {
        int n1=6,n2=28,sum1=0,sum2=0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            sum1=sum1+i;
        }
        for(int i=1;i<n2;i++)
        {
            if(n2%i==0)
            sum2=sum2+i;
        }
        sum1=sum1/n1;
        sum2=sum2/n2;
        if(sum1==sum2)
        System.out.println("Friendly Pair");
        else
        System.out.println("Not a Friendly Pair");
    }
}
