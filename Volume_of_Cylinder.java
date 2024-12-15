import java.util.Scanner;

class Volume_of_Cylinder {
    public static void main(String[] args) {

        int radius;
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        radius = sc.nextInt();
        System.out.println("The Volume of Cylinder is : " + (4 / 3 * pi * radius * radius * radius));
    }
}
