package ProblemSolving;

import java.util.Scanner;

public class _5_CountOccurrencesCharacterInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter main string..");
        String str1 = scan.nextLine();
        System.out.println("Enter occurrence character..");
        String str2 = scan.nextLine();
        
        int totalCount = str1.length();
        int afterRemoveCount = str1.replace(str2, "").length();
        
        int count = totalCount - afterRemoveCount;
        System.out.println("Occurrence number in the list : " + count);
    }
    
}
