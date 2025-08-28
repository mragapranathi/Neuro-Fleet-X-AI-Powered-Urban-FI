// Abstract class example
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("This animal is sleeping...");
    }
}

// Subclass Dog extends Animal
class Dog extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Subclass Cat extends Animal
class Cat extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class
public class AbstractClass_Example {
    public static void main(String[] args) {
        // Animal a = new Animal(); //  Not allowed (can't create object of abstract class)

        // Create objects of subclasses
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog:");
        d.sound();
        d.sleep();

        System.out.println("\nCat:");
        c.sound();
        c.sleep();
    }
}
