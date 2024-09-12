package HelloJava;

public class looppart2 {

    public static void main(String[] args) {

        int n = 100;
        int statement = 0;
        for (int start = 1; start <= n; start++) { // start++ is the same thing as: start=start+1
            statement = start * (start + 1) / 2;
            System.out.println(statement);


            //int n = 2;
            //for(int start = 1; start < n; start++)
            //    int statement = n*(n+1)/2;
            // Refer to the formula above. t
            // The n is replaced with start which equals to 1
            // *
            // What this program is doing is creating a loop, that is replacing every number with
            //a new number all the way up to 100, it creates a 100 instances
            //where the number multiples itself until the loop is completed
            //
            //System.out.println(statement);

        }
    }
}
