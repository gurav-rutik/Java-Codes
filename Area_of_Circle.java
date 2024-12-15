import java.util.Scanner;

class Area_of_Circle {
    public static void main(String[] args) {

        int radius;
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        radius = sc.nextInt();
        System.out.println("The Area of circle is : " + (2 * pi * radius));
    }
}
