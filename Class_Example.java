// Example of a Java class
public class Class_Example {
    // Attributes (data members)
    int rollNumber;
    String name;
    int age;

    // Method to set student details
    void setDetails(int r, String n, int a) {
        rollNumber = r;
        name = n;
        age = a;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of Class_Example
        Class_Example s1 = new Class_Example();
        Class_Example s2 = new Class_Example();

        // Setting details
        s1.setDetails(101, "Alice", 20);
        s2.setDetails(102, "Bob", 21);

        // Displaying details
        System.out.println("Student 1 Details:");
        s1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
    }
}
