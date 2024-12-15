import java.util.Scanner;

class Perfect_Square {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        do {
            x++;
        } while (x * x < num);
        System.out.println(x * x == num);
    }
}