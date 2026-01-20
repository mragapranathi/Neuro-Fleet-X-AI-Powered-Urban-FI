package Working_with_Numbers;

public class Permutations_in_which_n_people_can_occupy_r_seats_in_a_classroom {
    public static void main(String[] args) {
        int n=5,r=9;
        int fn=1,fr=1;
        for(int i=1;i<=n;i++)
        {
            fn=fn*i;
        }
        for(int i=1;i<=n-r;i++)
        {
            fr=fr*i;
        }
        int way = fn/fr;
        System.out.println(way);
    }
}
