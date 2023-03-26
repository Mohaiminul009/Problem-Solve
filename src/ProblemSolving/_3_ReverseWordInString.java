package ProblemSolving;

public class _3_ReverseWordInString {
    public static void main(String[] args) {
        String str = "Welcome to java";
        String[] arr = str.split(" ");
        String reverseString = "";
        for (String s : arr) {
            String reverseWord = "";
            for (int i = s.length()-1; i >= 0; i--) {
                reverseWord = reverseWord + s.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }
}
