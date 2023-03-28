package java_program_week_8;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * **
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Diamond {
    public static void main(String[] args) {
        Diamond obj = new Diamond();
        obj.diamond();
    }
    public void diamond() {

        Scanner s = new Scanner(System.in);   // scanner declaration
        System.out.println("Enter Row: ");
        int n = s.nextInt();
        System.out.print("Enter Symbol : ");
        char c = s.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {                    //while loop
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
        s.close();              // scanner closing
    }
}

