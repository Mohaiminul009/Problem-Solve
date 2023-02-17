/*
 Write a java program to find largest of three numbers?
 */
package problemsolve;

import java.util.Scanner;

public class FindTheLargestFromThreeNumbers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        if (x>y && x>z) {
            System.out.println(x + " is the largest number.");
        }else if(y>z && y>x){
            System.out.println(y + " is the largest number.");
        }else{
            System.out.println(z + " is the largest number.");
        }
    }
}
