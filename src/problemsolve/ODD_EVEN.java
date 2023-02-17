/*
Write a java program to find even and odd number?
 */
package problemsolve;

import java.util.Scanner;

public class ODD_EVEN {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x%2 == 0) {
            System.out.println(x + " is Even number");
        }else{
            System.out.println(x + " is Odd number");
        }
    }
}
