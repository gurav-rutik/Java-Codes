import java.util.Scanner;

class Compount_Interest {
    public static void main(String[] args) {

        double principle, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle : ");
        principle = sc.nextFloat();
        System.out.println("Enter the rate : ");
        rate = sc.nextFloat();
        System.out.println("Enter the time : ");
        time = sc.nextFloat();
        double ComInt = principle * (Math.pow((1 + rate / 100), time));
        System.out.println("Compount Interest = " + ComInt);
    }
}
