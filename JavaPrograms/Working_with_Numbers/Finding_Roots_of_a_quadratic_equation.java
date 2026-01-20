package Working_with_Numbers;

public class Finding_Roots_of_a_quadratic_equation {
    public static void main(String args[])
    {
 
        int a = 5, b = 20, c = 32;
       
        // Function call
        findRoots(a, b, c);
    }
    static void findRoots(int a, int b, int c)
    {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
 
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));
 
        if (d > 0) {
            System.out.println("Roots are real and different");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n"+ (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex");
 
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val + "\n" + -(double)b / (2 * a) + " - i" + sqrt_val);
        }
    }
 
    // Driver code
    
}
