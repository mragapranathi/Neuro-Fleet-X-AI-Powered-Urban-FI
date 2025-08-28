// Constructor Example in Java
public class Constructor_Example {
    int rollNumber;
    String name;
    int age;

    // Constructor (same name as class, no return type)
    Constructor_Example(int r, String n, int a) {
        rollNumber = r;
        name = n;
        age = a;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using constructor
        Constructor_Example s1 = new Constructor_Example(101, "Alice", 20);
        Constructor_Example s2 = new Constructor_Example(102, "Bob", 21);

        // Display details
        System.out.println("Student 1 Details:");
        s1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
    }
}
