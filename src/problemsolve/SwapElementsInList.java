/*
1. How to swap elements in list in java?
2. How to swap two number in java?
 */
package problemsolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsInList {
    public static void main(String[] args) {
//        <<< 1 >>
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Before swaping : "+list);
        Collections.swap(list, 0, 1);  //swap(list, index, index)
        System.out.println("After swaping : "+list);
        
//        <<< 2 >>>
        int a = 10, b = 20;
        System.out.println("Before sawp the numbers : "+a+"  "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After sawp the numbers : "+a+"  "+b);
    }
}
