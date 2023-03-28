package java_program_week_8;

import java.util.Scanner;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the
 * method should return false.
 */
public class SharedDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = s.nextInt();
        System.out.println("Result: " + hasSharedDigit(n1, n2));
        s.close();
    }

    public static boolean hasSharedDigit(int a, int b) {    //with return with parameters
//        if (a > 10 || b > 99)
//            return false;
//            int x = a % 10;
//            int y = b % 10;
//            a /= 10;
//            b /= 10;
//            return(a == b || a == y || x == b || x == y);
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;

        if (aL == bL || aL == bR || aR == bL || aR == bR)           //if else loop
            return true;
        else
            return false;
    }
}



