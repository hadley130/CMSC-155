package School;

public class Tester {
    public static void main(String[] args) {
        // Creating Student objects
        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);

        // Testing precedesById method
        System.out.println("bob1 precedes bob2: " + bob1.precedesById(bob2)); // Should return true
        System.out.println("bob2 precedes bob1: " + bob2.precedesById(bob1)); // Should return false
    }
}
