import java.util.Scanner;

class Ascii_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        // char a = sc.next().charAt(0);
        int c = sc.nextInt();
        // int b = (int) a;
        char d = (char) c;
        // System.out.println("Ascii value of : " + a + " is : " + b);
        System.out.println("Ascii value of : " + c + " is : " + d);

    }
}
