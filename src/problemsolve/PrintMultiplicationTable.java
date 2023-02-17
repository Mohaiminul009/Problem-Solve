/*
Write a java program to print multiplication table?
 */
package problemsolve;

import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to watch multiplication table..");
        int x = scan.nextInt();
    
        for(int i=1; i<=10; i++){
            System.out.println(x +"*"+ i +"="+ x*i);
        }
    }
}
