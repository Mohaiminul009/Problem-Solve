package ProblemSolving;

public class _7_RemoveJunkOrSpecialCharacter {
    public static void main(String[] args) {
        String str = "$Java~Python`1269642`Dotnet;Ruby";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
