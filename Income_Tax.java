import java.util.Scanner;

class Income_Tax {
    public static void main(String[] args) {

        float income, tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        income = sc.nextFloat();
        if (income <= 10000) {
            System.out.println("No any tax!");
        } else if (income >= 10000 && income < 50000) {
            tax = income * 0.2f;
            System.out.println("tax = " + tax);
        } else if (income >= 50000 && income < 100000) {
            tax = income * 0.3f;
            System.out.println("tax = " + tax);
        } else if (income >= 100000 && income < 1000000) {
            tax = income * 0.4f;
            System.out.println("tax = " + tax);
        } else {
            tax = income * 0.5f;
            System.out.println("tax = " + tax);
        }
    }
}
