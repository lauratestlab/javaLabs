package genericLabs;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args) {



//        List<Integer> intsList = Arrays.asList(1, 5, 7, 2, 3);
////        Note because the list is generic the changes the order of the Strings
//        List<String> strsList = Arrays.asList("Java", "World", "Hello");
//        System.out.println(reverse(intsList)); // Expected: [3, 2, 7, 5, 1]
//        System.out.println(reverse(strsList)); // Expected: ["Hello", "World", "Java"]
//

        GenericStack<String> stack = new GenericStack<>();
        stack.push("World");
        stack.push("Hello");
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());

    }
//    Note the name of the variable doesn't matter as long as the variable matches in the function
    public static <T> List<T> reverse(List<T> intsList) {

      List<T> list = new ArrayList<>();

//        It has to be  equal to or greater than 0. That way it will include the last number on the index
//        The order of the for loop is reversed because, I am trying to get the numbers to output in reverse order
        for(int i = intsList.size() -1; i >=0 ; i--){
//            the array list.add is used to pass the list that has the numbers through it in reverse
            list.add(intsList.get(i));

        }

        return list;
    }

}