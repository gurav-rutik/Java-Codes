
import java.util.Scanner;

class Area_of_Rectangle {
    public static void main(String[] args) {

        int length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = sc.nextInt();

        System.out.println("The area of rectangle = " + (float) (length * breadth));
    }
}