package java_program_week_8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.myPrimeNumber();
    }

    public void myPrimeNumber() {
        int temp;
        boolean isPrime = true;
        Scanner s = new Scanner(System.in);     //scanner declaration
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num = s.nextInt();
        for (int i = 2; i <= num / 2; i++) {            // for loop
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime) {                                  //if else loop
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + "is not a Prime Number");
            s.close();
        }
    }
}
