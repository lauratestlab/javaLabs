package UsingInterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentTest{

    public static void main(String[] args) {
        Student s1 = new Student("Sam", "Dan", 10);
//         This contains the information of the student class
//         In there I have set the conditions for the -1, 0, 1
        Student s2 = new Student("smith", "toy", 70);
        Student s3 = new Student("Lora","Dan", 80);

        ArrayList<Student> studentArrayList = new ArrayList<>();
//        This is a new instance of the studentArray list which contains the information in Student

        studentArrayList.add(s1);
//        These are new instances of the students added to the array list
        studentArrayList.add(s2);
        studentArrayList.add(s3);

        System.out.println("[Before]"+studentArrayList+"\n");
//        This will print out the array list before it is sorted
        Collections.sort(studentArrayList);
        System.out.println("[After]"+studentArrayList+"\n");
//        This will print out the array list after it is sorted


    }

}
