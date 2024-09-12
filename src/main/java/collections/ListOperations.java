package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> linkedList = new ArrayList<>();
//      Created a LinkedList and passed the array list through it (list)
//        LinkedList<Integer> linkedList = new LinkedList<>(list);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);
        linkedList.add((int) (Math.random() * 10) + 1);


//        int sum = 0;
//
//// Changed the variable name from list to linkedList because that is the name of
////  LinkedList that is being used it contains all the information of the list.
//        for (Integer mylist : linkedList) {
//
//            sum += mylist;
//
//        }
        int sum =sumNumberList(linkedList);

        System.out.println("Lists: " + linkedList);
        System.out.println("Summed: " + sum);


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
//        System.out.println(countTenThousand());
        System.out.println(ratioOfList(countTenThousand()));

    }

    public static int sumNumberList(List<Integer> numList) {
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

    public static int multiplyNumberList(List<Integer> numList) {
        int multi = 1;
        for (Integer number : numList) {
            multi *= number;


        }
        System.out.println("Mulitplied: " + multi);
        return multi;
    }

    public static List<List<Integer>> countTenThousand() {
        Random rand = new Random();
//        int randomNumber = (int) Math.random() * 10 + 1;
        int length = 5;
        //    Created a list within a list using the List
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
//        This is the first for loop that will create the an array that
        for (int i = 0; i < 10; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
               int  randNumber = rand.nextInt(10)+1;
//                randomNumber = (int) Math.random() * 10 + 1;
//                list.add(randNumber);
                list.add(randNumber);


            }
            lists.add(list);
//            System.out.println(list);
//            System.out.println(lists);
        }

        return lists;
    }
    public static int ratioOfList( List<List<Integer>> lists){
        System.out.println("my list: " + lists);
int sum =0;

        for(List newList: lists){
             sum = sumNumberList(newList);
            double multi = multiplyNumberList(newList);
            System.out.println(sum);
            System.out.println(multi);
            System.out.println(sum/multi);
        }
        return sum;
    }
}