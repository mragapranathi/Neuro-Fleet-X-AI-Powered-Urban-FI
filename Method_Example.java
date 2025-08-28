// Example of methods in Java
public class Method_Example {

    // Method without return type and parameters
    void greet() {
        System.out.println("Hello! Welcome to Java Methods Example.");
    }

    // Method with parameters but no return type
    void displayDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method with return type and parameters
    int addNumbers(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        // Create object of Method_Example
        Method_Example obj = new Method_Example();

        // Call methods
        obj.greet();

        System.out.println("\nCalling displayDetails():");
        obj.displayDetails("Alice", 20);

        System.out.println("\nCalling addNumbers():");
        int sum = obj.addNumbers(10, 15);
        System.out.println("Sum: " + sum);
    }
}
