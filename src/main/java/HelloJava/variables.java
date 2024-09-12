package HelloJava;

public class variables {
    public static void main(String[] args){
     int number = 5;
     //This a variable that falls under the int(type) and the variable name is number
     // which equals to 5
        int result =(number+3);
        //Creating a new class that combines the previous that was created with the variable number
        // and the number 3 use the addition sign the let the program know that you want to add

     System.out.println(result);

     String toPrint = "Your result is" +  result;
      //Create a new String with the variable name toPrint
     System.out.println(toPrint);
     double decResult = number+5.32;
     //Declear the decResult as a double with a lower case d, it will read the decimal

     System.out.println(decResult);
    }
}
