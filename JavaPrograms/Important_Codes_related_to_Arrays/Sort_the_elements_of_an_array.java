package Important_Codes_related_to_Arrays;

import java.util.Arrays;

public class Sort_the_elements_of_an_array {
    public static void main(String[] args) {
        int [] a={5, 2, 9, 1, 5, 6};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }   
}
