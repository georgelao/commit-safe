public class CommitCafe {

    private static String barista = "G"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String title = "Head Roaster";

    private static int cups = 0;

    public static void brew(String drink) {        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.print("cups is now "+ cups);
        // STUDENT_TODO_2B: Add a second brew-related improvement
        System.out.println("THIS IS A HUGE IMPROVEMENT");

    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}