/*
 * A fitness enthusiast is contemplating joining a local gym that offers personalized discounts based on
 *  their Body Mass Index (BMI).

The gym categorizes members into different BMI ranges and adjusts membership fees accordingly.

All Bookmarks

Your task is to develop a Java program to assist the gym enthusiast in determining the discounted 
membership fee based on the customer's BMI.

Tasc

Write a Java program that:

Takes inputs for the customer's weight (in kilograms) and height (in meters) and the gym membership fees.

Calculates the customer's BMI using the formula BMI = weight/ (height height).

Classifies the customer into BMI categories:

Underweight: BMI < 18.5

Normal weight: 18.5 <= BMI < 24.9

Overweight: 25 <= BMI < 29.9

Obesity: BMI>= 30

Applies the following discounts on gym membership fees based on the BMI category:

"Underweight": 15% discount

"Normal weight": 10% discount

"Overweight": 5% discount

"Obesity': No discount

Computes and prints the discounted membership fee based on the customer's entered total membership fee.

Instructions:

Ensure the program handles decimal inputs accurately and use appropriate methods to encapsulate BMI 
calculation and discount logic. Display the category, discount percentage applied and the final discounted 
membership fee in the output.
Test Cases

Input: 58 1.9 600

Output: Underweight 15.0 510.0

case 1:

Input 58, 1.9, 600

Output - Underweight 15.0 510.0
 */

import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for weight, height, and membership fee
        System.out.println("Enter your weight (in kilograms):");
        double weight = scanner.nextDouble();
        
        System.out.println("Enter your height (in meters):");
        double height = scanner.nextDouble();
        
        System.out.println("Enter the gym membership fee:");
        double membershipFee = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Variables for discount percentage and BMI category
        double discountPercentage;
        String bmiCategory;

        // Determine discount and BMI category using switch
        int bmiRange;
        if (bmi < 18.5) {
            bmiRange = 1;
        } else if (bmi < 24.9) {
            bmiRange = 2;
        } else if (bmi < 29.9) {
            bmiRange = 3;
        } else {
            bmiRange = 4;
        }

        switch (bmiRange) {
            case 1:
                bmiCategory = "Underweight";
                discountPercentage = 15.0;
                break;
            case 2:
                bmiCategory = "Normal weight";
                discountPercentage = 10.0;
                break;
            case 3:
                bmiCategory = "Overweight";
                discountPercentage = 5.0;
                break;
            case 4:
            default:
                bmiCategory = "Obesity";
                discountPercentage = 0.0;
                break;
        }

        // Calculate discounted fee
        double discountedFee = membershipFee - (membershipFee * discountPercentage / 100);

        // Output the results
        System.out.printf("Category: %s\n", bmiCategory);
        System.out.printf("Discount applied: %.1f%%\n", discountPercentage);
        System.out.printf("Discounted membership fee: %.1f\n", discountedFee);
    }
}
