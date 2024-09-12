package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExtension {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//      Created a LinkedList and passed the array list through it (list)
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);


        int sum = 0;

// Changed the variable name from list to linkedList because that is the name of
//  LinkedList that is being used it contains all the information of the list.
        for (Integer mylist :linkedList) {

            sum += mylist;

        }
        System.out.println("Lists: " +linkedList);
        System.out.println("Summed: " + sum);

        sumNumberList(linkedList);

//      Changed List the LinkedList because an array list is no longer being used.
        LinkedList<Integer> list2 = generateNumberList(1, 10);
//      Stored the multiplyNumberList method in multi
//      Within multiplyNumberList List2 is in the parameters, that contain the numbers that
//      Will be looped through and multiplied
        int multi;
        multi = multiplyNumberList(list2);
//      Declaring the double inside the sum/multi result will type class both variables
        double ratio = (double) sum / multi;
        System.out.println("Ratio of Summed to Multiplied: " + ratio);

    }

    public static int sumNumberList(LinkedList<Integer> numList) {
        int sum = 0;
        for (Integer number : numList) {
            sum += number;

        }

        return sum;
    }


    public static LinkedList<Integer> generateNumberList(int count, int max) {
//        List<Integer> newList = new ArrayList<>();
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = count; i < max; i++) {
            newList.add(i);
        }
        return newList;
    }

    public static int multiplyNumberList(LinkedList<Integer> numList) {
        int multi = 1;
        for (Integer number : numList) {
            multi *= number;


        }
        System.out.println("Mulitplied: " + multi);
        return multi;
    }
}
