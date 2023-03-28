package java_program_week_8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.anyNumber();
    }
    public void anyNumber() {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);                 //scanner declaration
        System.out.println("Enter any integer you want to check:");
        n = s.nextInt();
        a = n;
        c = n;
        while (a > 0) {                 //nested while loop
            a = a / 10;
            count++;
        }
        while (n > 0) {
            b = n % 10;
            sum = (int)
                    (sum + Math.pow(b, count));
            n = n / 10;
        }
        if (sum == c) {                     //if else loop
            System.out.println("Given number is Armstrong");
        } else {
            System.out.println("Given number is not Armstrong");
        }
        s.close();              //scanner close
    }
}