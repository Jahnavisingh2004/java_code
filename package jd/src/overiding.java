// Base class
class Operation {
    public int calculate(int a, int b) {
        return a + b;  // Default: addition
    }
}

// Subclass that overrides the method for multiplication
class MultiplyOperation extends Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;  // Overridden: multiplication
    }
}

// Subclass that overrides the method for subtraction
class SubtractOperation extends Operation {
    @Override
    public int calculate(int a, int b) {
        return a - b;  // Overridden: subtraction
    }
}

// Main class to test
public class overiding {
    public static void main(String[] args) {
        Operation op1 = new Operation();
        Operation op2 = new MultiplyOperation();
        Operation op3 = new SubtractOperation();

        System.out.println("Addition: " + op1.calculate(10, 5));       // Output: 15
        System.out.println("Multiplication: " + op2.calculate(10, 5)); // Output: 50
        System.out.println("Subtraction: " + op3.calculate(10, 5));    // Output: 5
    }
}