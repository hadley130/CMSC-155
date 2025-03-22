package School;
public class Course {
    // Attributes for the course's department, course number, and credit hours
    private String department;
    private String courseNumber;
    private int creditHours;

    // Constructor to initialize department, courseNumber, and creditHours
    public Course(String department, String courseNumber, int creditHours) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Getter for course number
    public String getCourseNumber() {
        return courseNumber;
    }

    // Getter for credit hours
    public int getCreditHours() {
        return creditHours;
    }

    // toString method to return a string representation of the Course object
    @Override
    public String toString() {
        return "Course: " + department + " " + courseNumber + " (" + creditHours + " credit hours)";
    }
}
