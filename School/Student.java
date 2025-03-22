package School;

public class Student {
    private String name;
    private int IDnum;

    private static int nextID = 1000; // Starting ID number

    // Constructor that accepts name and ID number
    public Student(String name, int IDnum) {
        this.name = name;
        this.IDnum = IDnum;
    }

    // Second constructor using static nextID
    public Student(String name) {
        this.name = name;
        this.IDnum = nextID;
        nextID++;
    }

    public String getName() {
        return name;
    }

    public int getIDnum() {
        return IDnum;
    }

    // Method to check if this student's ID is smaller than another student's ID
    public boolean precedesById(Student otherStudent) {
        return this.IDnum < otherStudent.getIDnum();
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Student ID: " + IDnum;
    }
}
