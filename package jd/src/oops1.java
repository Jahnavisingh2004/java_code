class Calc {
    int a;
    public int add(int n1,int n2) {
        int r = n1+n2;
        return r;
    }
}

public class oops1 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calc s1 = new Calc();
        int result=s1.add(4,6);
        System.out.println(result);
    }
}
