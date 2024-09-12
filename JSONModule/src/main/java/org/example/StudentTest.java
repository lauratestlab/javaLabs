package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class StudentTest {

    public static void main(String[] args) throws IOException {
//      Created a new instance of student
        Student student = new Student();
//      Created and instance of the objectmapper it is used to convert java objects to JSON
        ObjectMapper mapper = new ObjectMapper();
//      mapper.writeValue is used to convert objects into JSON format
//      Write the 'student' object as JSON into a file named "student.json"
        mapper.writeValue(new File("student.json"), student);
//      Back slashes create spaces around the string. You will only see the quotes
        String input = "{\"type\":\"Cat\",\"name\":\"fluffles\",\"age\":3}";


        Animal cat = new Animal();
        cat = mapper.readValue(input, Animal.class);

        Animal dog = mapper.readValue(input, Animal.class);
        File file = new File("student.json");
        student = mapper.readValue(file, Student.class);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(student);

    }

}
