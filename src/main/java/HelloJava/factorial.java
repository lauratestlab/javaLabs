package HelloJava;

public class factorial {
    public static void main(String[] args) {

        int result = 1;
        int toFind = 5;


            while (toFind != 0) {

                result = result * toFind;
//                result is equal to (results * toFind)
//                Example result (5*1)
//                        5 will take the place of the result =
//                  the formula will like this 5 = (5*1)
//  and it will continue on until it reaches 0, 5 = (4*1)
//  It will then multiple the 5 by the 4 and this will continue on until it reaches 0 (check page 1 in book)
                toFind--;
//                The serves as a decrement which subtract by increments of 1 it means
//                toFind = toFind - 1

            }
            System.out.println(result);

            }
        }

// for (int toFind = 6; toFind < 1; toFind--)
//result = result * toFind;