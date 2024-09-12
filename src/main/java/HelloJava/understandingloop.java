package HelloJava;

public class understandingloop {


    public static void main(String[] args) {
        for (int cand = 2; cand <=100; cand++){
            boolean isPrime = true;
            System.out.println("outer loop");
            //The code will run the outer loop first
            for (int test = 2; test <=cand; test++){
                if ((cand % test == 0) && (cand != test)) {
                    isPrime = false;
                    System.out.println("Inner loop");
                    //Then the inner loop will be run, and it will compare the results with the outer loop
                    //The remainder is 0 because after you divide 2 by 2 there is nothing left
                }
            }
            if (isPrime)  {System.out.println(cand);}
        }
    }
}
