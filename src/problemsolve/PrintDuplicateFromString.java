/*
Write a java program to print duplicates from String in java.
 */
package problemsolve;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateFromString {
    
    public static void main(String[] args) {
         String str = "java";
         
        Map<Character, Integer> map = new HashMap<>();
        char[] character = str.toCharArray();
        for (char c : character) {
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            for (Map.Entry<Character, Integer> entry : set) {
                if (entry.getValue() > 1) {
                    System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
