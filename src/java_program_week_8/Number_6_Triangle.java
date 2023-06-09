package java_program_week_8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Number_6_Triangle {
    public static void main(String[] args) {
        Number_6_Triangle obj = new Number_6_Triangle();
        obj.triangle();
    }

    public void triangle() {
        int i, j, n;
        System.out.print("Input number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (i = 1; i <= n; i++) {          //use of nested  for loop
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
        s.close();
    }
}
