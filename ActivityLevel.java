/*

Design a program that tracks a person's daily steps and categorizes their activity 
level based on the number of steps taken. Implement an else-if ladder that takes the 
number of steps as input and outputs the corresponding activity level according to the following criteria:

Less than 5000 steps: Sedentary

5000 to 7499 steps: Low Active

7500 to 9999 steps: Somewhat Active

10000 to 12499 steps: Active

12500 or more steps: Highly Active

Test Cases

case 1:

Input - 3000

Output Sedentary
 */
import java.util.Scanner;

public class ActivityLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of steps taken 
        System.out.println("Enter the number of steps taken today:");
        int steps = scanner.nextInt();

        // Determine the activity level using an else-if ladder
        if (steps < 5000) {
            System.out.println("Sedentary");
        } else if (steps >= 5000 && steps <= 7499) {
            System.out.println("Low Active");
        } else if (steps >= 7500 && steps <= 9999) {
            System.out.println("Somewhat Active");
        } else if (steps >= 10000 && steps <= 12499) {
            System.out.println("Active");
        } else {
            System.out.println("Highly Active");
        }
    }
}