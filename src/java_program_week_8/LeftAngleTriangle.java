package java_program_week_8;
import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class LeftAngleTriangle {
    public static void main(String [] args){
        LeftAngleTriangle obj = new LeftAngleTriangle();
        obj.leftTriangle();
    }
    public void leftTriangle(){
        int i, j, rows;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the number of rows: ");
        rows = s.nextInt();
        System.out.println("The left triangle star pattern: ");
        for (i=0; i<rows; i++){                 //nested for loop
            for (j=0; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
    } s.close();
}}


