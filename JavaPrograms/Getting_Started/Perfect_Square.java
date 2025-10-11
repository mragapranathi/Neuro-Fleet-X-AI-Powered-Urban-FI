package Getting_Started;

public class Perfect_Square {
    public static void main(String[] args) {
        int n=15,flag=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n==(i*i))
            {
                System.out.println("Perfect Square");
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Not a Perfect Square");
    }
}
