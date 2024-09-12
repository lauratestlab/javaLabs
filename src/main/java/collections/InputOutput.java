package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws FileNotFoundException {
//        Added the downloaded file using a relative path and not an absolute path
      File file = new File("src/resources/Alice.txt");
//          The scanner is used to keep track of the words
        try (Scanner scanner = new Scanner(new FileInputStream((file)))){
            int wordCount = 0;
//          The while loop is used to loop through each word in the file
            while(scanner.hasNext()){
//              Used to move tp the next word in the file
                scanner.next();
//              increment the words by one and move to the next word
                wordCount++;

            }
//            Prints out the total number of words
            System.out.println(wordCount);
//            Used to handle any errors during the file reading
        }catch (IOException e){
//            Print the stack if an error happens
            e.printStackTrace();
        }
    }

}
