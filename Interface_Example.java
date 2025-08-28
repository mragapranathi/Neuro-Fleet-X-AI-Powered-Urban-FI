// Interface example
interface Animal {
    // Abstract method (by default public and abstract)
    void sound();

    void eat();
}

// Dog implements Animal
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Cat implements Animal
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    public void eat() {
        System.out.println("Cat drinks milk.");
    }
}

// Main class
public class Interface_Example {
    public static void main(String[] args) {
        // We can use interface reference
        Animal a;

        a = new Dog();  // Dog object
        System.out.println("Dog:");
        a.sound();
        a.eat();

        System.out.println();

        a = new Cat();  // Cat object
        System.out.println("Cat:");
        a.sound();
        a.eat();
    }
}
