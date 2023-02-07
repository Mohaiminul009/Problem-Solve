/*
How to reverse the order of elements in arraylist in java?
 */
package problemsolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrderInArraylist {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        System.out.println("Before reversing : "+ list);
        
        Collections.reverse(list);
        System.out.println("After reversing : "+ list);
    }
    
}
