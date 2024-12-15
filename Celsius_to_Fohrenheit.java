import java.util.Scanner;

class Celsius_to_Fohrenheit {
    public static void main(String[] args) {

        float celsius, fohrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempereture in celsius : ");
        celsius = sc.nextFloat();
        fohrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius = " + celsius + "\nFohrenheit = " + fohrenheit);
    }
}
