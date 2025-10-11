package Important_Codes_related_to_Arrays;

public class Sort_first_half_in_ascending_order_and_second_half_in_descending {
    public static void main(String[] args) {
        int [] a={3, 2, 4, 1, 10, 30, 40, 20};
        for(int j=0;j<a.length-1;j++){
        for(int i=0;i<a.length/2;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=a.length/2;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
