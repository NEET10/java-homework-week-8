package java_program_week_8;
import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class SingleAlphabetCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Provide single alphabet character: ");
        String alp = s.next().toLowerCase();

        boolean uppercase = alp.charAt(0) >= 65 && alp.charAt(0) <= 90;
        boolean lowercase = alp.charAt(0) >= 97 && alp.charAt(0) <= 122;
        boolean vowels = alp.equals("a") || alp.equals("e") || alp.equals("i")
                || alp.equals("o") || alp.equals("u");
        s.close();
        if (alp.length() > 1) {
            System.out.println("Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Not a letter, Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }

}

//    public static void main(String[] args) {
//        SingleAlphabetCharacter obj = new SingleAlphabetCharacter();//object creation
//        obj.vowelConsonant();
//    }
//
//    public void vowelConsonant() {
//        int i = 0;
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Input an alphabet : ");
//        char ch = s.next().charAt(0);
//
//        //nested if else method
//
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            System.out.println("Expected Output:");
//            System.out.println("Input letter is Vowel");
//        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//            System.out.println("Expected Output:");
//            System.out.println("Input letter is Consonant");
//        } else {
//            System.out.println("Not a valid character");
//            s.close();// closing the scanner
//        }
//    }
