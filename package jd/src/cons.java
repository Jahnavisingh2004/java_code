class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called!");
    }

    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called!");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class cons {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Alice", 20);
        s2.display();

        Student s3 = new Student("Bob", 22);
        s3.display();
    }
}
