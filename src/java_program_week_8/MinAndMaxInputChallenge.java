package java_program_week_8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {                        //Main method
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();//object creation
        obj.validNumbers();                                         //method calling by object
    }
    public void validNumbers(){
        Scanner s = new Scanner(System.in);                         //Scanner declaration
        System.out.println("Enter a number(0r 0 to stop): ");
        int num = s.nextInt();
        int max = num;
        int min = num;
        while(num != 0){
            if (num> max){                                          //if else method is used
                max = num;
            } else if (num < min) {
                min = num;
            }
            System.out.println("Type a number (0r 0 to stop): ");
            num = s.nextInt();
        }
        if (max != 0 && min != 0){                                  // if method used
            System.out.println("Maxium number is :"+ max);
            System.out.println("Minimum number is :"+ min);
        }

        s.close();
    }
}


