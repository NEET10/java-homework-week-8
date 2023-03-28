package java_program_week_8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {
    public static void main(String[] args) {
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.rightTriangle();

    }

    public void rightTriangle() {
        Scanner s = new Scanner(System.in); // Scanner declaration
        char triangleChar;
        int triangleHeight;
        System.out.println("Enter a character:");
        triangleChar = s.next().charAt(0);
        System.out.println("Enter triangle height:");
        triangleHeight = s.nextInt();
        int counter = 1;                                //Count the number of chars for each line
        for (int i = 0; i < triangleHeight; i++) {      // nested for loop use
            String currentLine = "";
            for (int j = 0; j < counter; j++) {

                currentLine += triangleChar + "";
            }
            System.out.println(currentLine);
            counter++;
        }
        s.close();                                              // scanner close
    }
}
