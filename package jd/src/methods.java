class MathOps {
    public void greet() {
        System.out.println("Hello! Welcome to MathOps.");
    }

    public void square(int num) {
        int result = num * num;
        System.out.println("Square of " + num + " = " + result);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class methods {
    public static void main(String[] args) {
        MathOps obj = new MathOps();

        obj.greet();

        obj.square(5);

        int sum2 = obj.add(10, 20);
        System.out.println("Sum of 2 numbers = " + sum2);

        int sum3 = obj.add(5, 10, 15);
        System.out.println("Sum of 3 numbers = " + sum3);
    }
}
