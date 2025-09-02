class Person {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Jahnavi");
        System.out.println("Person's Name: " + p.getName());
    }
}
