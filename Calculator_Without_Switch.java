import java.util.Scanner;

class Calculator_Without_Switch {
    public static void main(String[] args) {

        int a, b;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the op : ");
        op = sc.nextInt();
        if (op == 1) {
            System.out.println("a + b = " + (a + b));
        } else if (op == 2) {
            System.out.println("a - b = " + (a - b));
        } else if (op == 3) {
            System.out.println("a * b = " + (a * b));
        } else if (op == 4) {
            System.out.println("a / b = " + (a / b));
        } else if (op == 5) {
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Choose correct op!!");
        }
    }
}
