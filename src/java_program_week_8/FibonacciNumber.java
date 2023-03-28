package java_program_week_8;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        obj.myNumber();
    }
    public void myNumber() {
        int n1 = 0, n2 = 1, n3, i, count = 12;
        for (i = 2; i < count; ++i) {                   //for loop
            n3 = n1 + n2;
            System.out.println("" + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
