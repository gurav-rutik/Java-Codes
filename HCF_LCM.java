import java.util.Scanner;

class HCF_LCM {
    public static void main(String[] args) {
        int num1, num2, a, b, c, i, hcf, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();
        a = num1;
        b = num2;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }

        hcf = a;
        lcm = (num1 * num2) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

    }
}
