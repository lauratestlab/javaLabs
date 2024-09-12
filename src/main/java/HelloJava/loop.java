package HelloJava;

public class loop {
    public static void main(String[] args) {
        int sum =0;
        //Initialize the sum outside the loop or it will factor it into the equation, giving the wrong answer
      for (int number = 1 ; number <= 20; number++){

          sum +=  number;
          //Note: that sum is equal to zero and in this formula the zero is replaced by the one and when it
          //loops it becomes 1 +2 example sum now =1 and the next number on the lis is 2 so number will equal 2
          //and it will add it which equals 3 and it will continue down the loop until it sums everything up
          //you have to use += for addition
          System.out.println(sum);



      }

      }


}
