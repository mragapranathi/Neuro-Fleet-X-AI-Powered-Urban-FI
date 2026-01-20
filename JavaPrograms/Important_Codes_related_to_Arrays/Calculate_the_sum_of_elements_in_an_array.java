package Important_Codes_related_to_Arrays;

public class Calculate_the_sum_of_elements_in_an_array {
    public static void main(String[] args) {
        int [] a= {12, 13, 1, 10, 34, 10};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s=s+a[i];
        }
        System.out.println(s);
    }
}
