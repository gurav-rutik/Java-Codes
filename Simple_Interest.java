import java.util.Scanner;

class Simple_Interest {
    public static void main(String[] args) {

        float principle, rate, time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle : ");
        principle = sc.nextFloat();
        System.out.println("Enter the rate : ");
        rate = sc.nextFloat();
        System.out.println("Enter the time : ");
        time = sc.nextFloat();
        float SimInt = (principle * rate * time) / 100;
        System.out.println("Simple Interest = " + SimInt);
    }
}
