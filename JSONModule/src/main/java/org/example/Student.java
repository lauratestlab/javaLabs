package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private  int age;
    private boolean fees;
    private List<Integer>mark = new ArrayList<>();

    public void Student(String firstName, String lastName, int age, boolean fees, List<Integer>mark){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.fees=fees;
    this.mark=mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFees() {
        return fees;
    }

    public void setFees(boolean fees) {
        this.fees = fees;
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }
}
