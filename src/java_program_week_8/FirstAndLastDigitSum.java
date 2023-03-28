package java_program_week_8;
import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Scanner declaration
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        sumFirstAndLastDigit(number);
        input.close();
    }

    public static void sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        int lastDigit = number;
        if (number >= 10) {                     //use of if else loop
            while (number >= 10) {
                firstDigit = number /= 10;
            }
            int last = lastDigit % 10;
            System.out.println("Sum of your first and last digits is " + (firstDigit + last));
        } else {
            System.out.println("-1, since the parameter is negative and needs to be positive.");


        }
    }
}

