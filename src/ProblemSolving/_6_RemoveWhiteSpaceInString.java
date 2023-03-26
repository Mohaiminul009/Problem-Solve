package ProblemSolving;

public class _6_RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String str = "java programming language";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
