

package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.random;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//      Created a LinkedList and passed the array list through it (list)

        list.add((int) (Math.random() * 10) + 1);
        list.add((int) (Math.random() * 10) + 1);
        list.add((int) (Math.random() * 10) + 1);
        list.add((int) (Math.random() * 10) + 1);
        list.add((int) (Math.random() * 10) + 1);

        int sum = 0;
        for(Integer newList: list){
            sum+=newList;
        }
        System.out.println(sum);
    }
}