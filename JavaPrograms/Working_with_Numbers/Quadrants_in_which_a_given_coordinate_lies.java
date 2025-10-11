package Working_with_Numbers;

public class Quadrants_in_which_a_given_coordinate_lies {
    public static void main(String[] args) {
        int x=-3, y=-33;
        
        if(x>0 && y>0)
        {
            System.out.println("Quadrant - 1");
        }
        else if(x>0 && y<0)
        {
            System.out.println("Quadrant - 4");
        }
        else if(x<0 && y>0)
        {
            System.out.println("Quadrant - 2");
        }
        else
        {
            System.out.println("Quadrant - 3");
        }
    }
}
