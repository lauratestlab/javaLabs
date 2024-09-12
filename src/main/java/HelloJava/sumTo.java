package HelloJava;

import java.util.Scanner;

class sumTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //This is what is used to read what a user types

        int numberFromUser =scanner.nextInt();
        //This is where the user will type a number that will be
        //calculated with the formula that was created at the bottom

        int calculatedSum = sumTo(numberFromUser);
        // This the method that is being called amd calculate the number that the user typed

        System.out.println(calculatedSum);
        //This will show you the numbers from 1 to the user typed
    }

    public static int sumTo(int d) {
        //This defines the static method
        // sumTo (int d) is used in place of the number that the user will be inputting place holder

        int sum = 0;
        // sum is set to 0 so that it will not be factored into the formula that it created
        //That  way it can be reusable
        for (int i = 1; i <= d; i++) {
            //This the pamitter of how the formula will be added
            sum += i;
//This is the final formula and it will add each number as it count to find the total sum
        }

        return sum;
//This will tell us what the sum is once we are done counting.

    }

}