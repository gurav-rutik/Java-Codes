import java.util.Scanner;

class Profit_Loss {
    public static void main(String[] args) {
        int Profit, Loss;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost price : ");
        int Cp = sc.nextInt();
        System.out.println("Enter Selling price : ");
        int Sp = sc.nextInt();

        Profit = Sp - Cp;
        Loss = Cp - Sp;

        if (Cp == Sp) {
            System.out.println("No any Profit or Loss!!");
        } else if (Sp > Cp) {
            System.out.println(Profit + " Rs. Profit ");
        } else {
            System.out.println(Loss + " Rs. Loss ");
        }
    }
}
