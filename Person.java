public class Person {

    private String person;
    private String rollno;

    // Constructor
    public Person(String name, String rollno) {
        this.person = name;
        this.rollno = rollno;
    }

    public String toString() {

        return "Name: " + this.person + "\nRollno: " + this.rollno;

    }

}
