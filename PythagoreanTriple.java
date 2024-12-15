/*Write a program to check whether a give sides of a triangle forms a Pythagorean triple. Prompt
 * the user to input the length of three sides of the triangle.Then, determine and display whether 
 * the triangle satisfy the Pythagorean theorem.    
 * Ex. 3^2+4^2 = 5^2
 * case1: 4,3,5 output=true
 */

import java.util.Scanner;

public class PythagoreanTriple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        // Variable to store whether the sides form a Pythagorean triple
        boolean isPythagoreanTriple = false;

        // Determine if the sides form a Pythagorean triple using an if-else ladder
        if ((side1 >= side2) && (side1 >= side3)) {
            // side1 is the largest
            if (side1 * side1 == side2 * side2 + side3 * side3) {
                isPythagoreanTriple = true;
            }
        } else if (side2 >= side1 && side2 >= side3) {
            // side2 is the largest
            if (side2 * side2 == side1 * side1 + side3 * side3) {
                isPythagoreanTriple = true;
            }
        } else {
            // side3 is the largest
            if (side3 * side3 == side1 * side1 + side2 * side2) {
                isPythagoreanTriple = true;
            }
        }

        // Output the result
        System.out.println(isPythagoreanTriple);
    }
}
