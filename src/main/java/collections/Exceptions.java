package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
//      Called the fib function to the main and assigned it a value to check the ArithmeticException
//      When set to a negative number the code breaks according to the ArithmeticException that was applied
//        try {
//            System.out.println(fib(-5));
//        } catch (FibonacciException error) {
//            System.err.println(error.getMessage());
//        }
//        This list is used to print out what is in the array list it is being called from the fiblist method
//        It will sort and separate according to the negative numbers
        System.out.println(fibList(Arrays.asList(1, 5, 3, 2, 5, -3, -2, 1, -4)));
    }


    public static int fib(int n) {
        if (n < 0) {

            throw new FibonacciException(n);

        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }


    public static List<Integer> fibList(List<Integer> n_list) {
        int sumOfErrors = 0;
        List<Integer> fibList = new ArrayList<>();
        for (Integer n : n_list) {
            try {
                fibList.add(fib(n));
            } catch (FibonacciException e) {
                sumOfErrors++;
            }

//        if(list<0){
//
//            System.err.println("list of #:" +list);
//            sumOfErrors++;
//        }else {
//          fibList.add(fib(list));
//    }


        }
//       The error count will be printed out through this method
        System.err.println("Err Count: " + sumOfErrors);
        return fibList;
    }

    // Use RuntimeException to get access to the main class
    static class FibonacciException extends RuntimeException {
        int n;

        public FibonacciException(int n) {

            super("Tried to fib with n=n: " + n);
        }

    }
}
