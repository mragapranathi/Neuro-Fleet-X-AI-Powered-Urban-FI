package Important_Codes_related_to_Arrays;

public class Find_Smallest_Element_in_an_Array {
    public static void main(String[] args) {
        int [] a={12, 13, 1, 10, 34, 10};
        int s=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(s>a[i])
            {
                s=a[i];
            }
        }
        System.out.println(s);
    }
}
