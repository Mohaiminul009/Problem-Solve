/*
Write a java program to check two Strings are anagrams or not by sorting and comparing strings?
 */
package problemsolve;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st string...");
        String str1 = scan.next();
        System.out.print("Enter 2nd string...");
        String str2 = scan.next();
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("They are anagram!");
        }else{
            System.out.println("They are not anagaram!");
        }
    }
}
