/*
How to remove the duplicates from String in java?
 */
package problemsolve;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    String str = "java";
    
    public String removeDuplicate(){
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<str.length(); i++){
            Character c = str.charAt(i);
            
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        RemoveDuplicateFromString obj = new RemoveDuplicateFromString();
        System.out.println(obj.removeDuplicate());
    }
}
