package School;

public class WorkStudyStudent extends Student {
    private int hoursWorked;

    public WorkStudyStudent(String name, int IDnum) {
        super(name, IDnum);
        this.hoursWorked = 0;
    }

    public WorkStudyStudent(String name) {
        super(name);
        this.hoursWorked = 0;
    }

    public void addHoursWorked(int hours) {
        if (hours > 0) {
            this.hoursWorked += hours;
        } else {
            System.out.println("Invalid number of hours. Must be positive.");
        }
    }

    @Override
    public String toString() {
        StringBuilder studentInfo = new StringBuilder(super.toString());
        studentInfo.append("\nWork-Study Student: Yes");
        studentInfo.append("\nHours Worked: ").append(hoursWorked);
        studentInfo.append("\nAmount Earned: $").append(hoursWorked * 7.25);
        return studentInfo.toString();
    }
}
