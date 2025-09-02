// Parent Class (Base Class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child Class (Derived Class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking!");
    }
}

// Main Class
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();   // Child class object
        d.name = "Tommy";    // Inherited property
        d.eat();             // Inherited method
        d.sleep();           // Inherited method
        d.bark();            // Child class method
    }
}
