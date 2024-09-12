package UsingInterfaces;

public class Student implements Comparable<Student> {


    private String firstName;
    private String surName;
    private int ID;


    public Student(String firstName, String surName, int ID) {
        this.firstName = firstName;
        this.surName = surName;
        this.ID = ID;
    }

    public String toString() {
        String Info = firstName + "\n" + surName + "\n" + ID;
        return Info;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int compareTo(Student o) {

        if (this.firstName.equals(o.firstName) &&
                this.surName.equals(o.surName)) {
            return 0;

        } else if (surName.compareTo(o.surName) !=0) {

            return surName.compareTo(o.surName);
        } else {
            return firstName.compareTo(o.firstName);

        }

    }
}


