class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

public class Method_Example {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(10, 5);
        int diff = calc.subtract(10, 5);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}
