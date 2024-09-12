package genericLabs;

import java.util.ArrayList;
import java.util.List;
import com.sun.jdi.Value;


public class EmptyAndGetGreatest {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(5);
        intStack.push(3);
        intStack.push(7);
        System.out.println(EmptyAndGetGreatest.emptyAndGetGreatest(intStack)); // Expected: 7
        System.out.println(intStack.size()); // Expected: 0
    }

    public static <T extends Comparable<T>>  T emptyAndGetGreatest (GenericStack<T> stack ){
//      This is the list that is being checked it contains the information from the stack above
        T newList;
//      This pointing to the top of the stack and it's assuming that whatever there hold the greatest value
        T max = stack.top();
//      The loop is used to pass each element through
//      The null is to ensure that the code continues to iterate as long as its not empty
        while((newList = stack.top()) != null) {
//       calls the current element to see if it's greater than the max
            if(newList.compareTo(max)>0){
                max = newList;
            }
//         Removes the current element from the stack
           stack.pop();


    }
    return max;
    }
}
