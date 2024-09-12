package HelloJava;
import java.util.Scanner;
//allows you to use scanner object

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = "";

        do {
//            int i = 18;

            System.out.println("What is your age?");
             input = scanner.nextLine();
            if (input.equals("exit")){
                // used if statement to define input.equals (has to be used for String unlike with
                //integers which use ==
                //In this case input.equal ="exit"
                break;
                //Break will stop the infinite loop
            }
            int age = Integer.parseInt(input); //input;
            //You have to use wrapper for integer which is the capital Integer
            //parseInt is used to convert a number into a string

            if (age >= 18) {
                //note that you should name the variable according to the function
                System.out.println("You are old enough");
            } else {
                int diff = 18 - age;
                //diff is calculating the difference between 18 and age
                //If they are more than 1 year older it will jump to the final else
                //Note the system will be able to calculate the difference using the formula
                if (diff == 1) {

                    System.out.println("You must be 1 year older to enter");
                } else {
                    System.out.println("You must be " + diff + "  years older to enter");
                    //This formula will calculate the difference between any age that is more than one year youbger
                }
            }
        }while (!input.equals("exit"));


        //The code will skip all of the other code amd jump down to the break point
        // Note 6/5: is the placement of the bracket causing the code not to run?
    }
}

