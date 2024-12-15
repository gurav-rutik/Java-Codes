import java.util.Scanner;

class Reverse_String {
    public static void main(String[] args) {

        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any string : ");
        str = sc.nextLine();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String = " + rev);
    }
}
