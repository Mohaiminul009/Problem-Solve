package ProblemSolving;

import java.util.Arrays;
import java.util.Collections;

public class _8_SortArrayByBuiltinMethod {
    public static void main(String[] args) {
        String[] str = {"java", "c#", "python", "ruby"};
        System.out.println("Before sorting :- " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("After ascending sorting :- " + Arrays.toString(str));
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println("After descending sorting :- " + Arrays.toString(str));
    }
}
