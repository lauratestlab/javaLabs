package HelloJava;

public class Variblesextension {
    public static void main(String[] args) {
        //Boolean is used to set the True or Flase. In this example Sun is set as the true value

        int a = 4;
        if (a == 4) {
            System.out.print("true");

        }
        //If I don't want the code to be related to the condition of the boolean then place it outside
        //the curly braces
        Double d = 5.2;
        //In the original double d = 5.2; was lowercase meaning it was a decimal. I had to just change the
        //lower case d in double to uppercase D to make it a whole number to bypass
        // d = 5.2 to make it read it as a whole number
        int i = d.intValue();
        System.out.println(i);
    }
}