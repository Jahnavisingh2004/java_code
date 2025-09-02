// First Interface
interface Addition {
    int add(int a, int b);
}

// Second Interface
interface Subtraction {
    int subtract(int a, int b);
}

// Class implementing both interfaces
class Calculator implements Addition, Subtraction {

    // Implement Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Implement Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Extra method
    public void showResult(int result) {
        System.out.println("Result = " + result);
    }
}

// Main Class
public class MultipleInheritanceCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(15, 10);
        int diff = calc.subtract(15, 10);

        calc.showResult(sum);   // 25
        calc.showResult(diff);  // 5
    }
}
