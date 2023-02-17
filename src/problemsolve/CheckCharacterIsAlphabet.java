/*
Write a java program to check given input character is alphabet or not ?
 */
package problemsolve;

import java.util.Scanner;

public class CheckCharacterIsAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the character...");
        char input = scan.next().charAt(0);
        
        if ((input>= 'a' && input<= 'z') || (input >= 'A' && input<= 'Z')) {
            System.out.println("The character is alphabet!");
        }else{
            System.out.println("The character is non-alphabet!");
        }
    }
}
