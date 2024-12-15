/*
 * A school follows a day wise time table for its students to play a specific game

TIME TABLE

Monday: Basket Ball

Tuesday: Tennis

Wednesday: Basket Ball

Thursday: Cricket

Friday: Tennis

Saturday: Exercise

Sunday: Holiday

Design a simple application which can read the day of the week and suggest to the student which 
game he is supposed to play today by following the prescribed timetable designed by the school.

Test Case 1:

Input: Monday

Output: Basket Ball

Test Case 2:

Input: Thursday

Output: Cricket

Test Case 3:

Input: Tuesdya

Output: Invalid Input
 */

import java.util.Scanner;

class SwitchEx2 {
    public static void main(String[] args) {
        String day="";
        Scanner sc = new Scanner(System.in);
        day = sc.next().toLowerCase();

        switch(day){
            case "monday":
            case "wednesday":
            System.out.println("Backet Ball");
            break;

            case "tuesday":
                System.out.println("Tennis");
                break;
            case "thursday":
                System.out.println("Cricket");
                break;
            case "friday":
                System.out.println("Tennis");
                break;
            case "saturday":
                System.out.println("Exersise");
                break;
            case "sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
