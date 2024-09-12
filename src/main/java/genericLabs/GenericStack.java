package genericLabs;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

//    GenericStack<String> stack = new GenericStack<>();
//        stack.push("World");
//        stack.push("Hello");
//        System.out.println(stack.top());
//        stack.pop();
//        System.out.println(stack.top());
//        System.out.println(stack.size());


    List<T> newList = new ArrayList<>();
//    Value[] myValue = {};

    //    Value[] values = new Value[];
    void push(T value){
        newList.add(value);

    }

    T top(){
//      I had to change add an if statement and set it greater to 1 and had it return null so the code in EmptyAndGetGreatest
        if(newList.size()< 1) return null;
        T value = newList.get(newList.size()-1);
        return value;
    }
    void pop() {
        newList.remove(newList.size()-1);
    }
    int size(){
        return newList.size();

    }
}
