package Important_Codes_related_to_Arrays;

public class Find_Largest_element_in_an_array {
    public static void main(String[] args) {
        int [] a={20, 5, 35, 40, 10, 50, 15};
        int s=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(s<a[i])
            {
                s=a[i];
            }
        }
        System.out.println(s);
    }
}
