import java.util.Scanner;

class String_Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String name = sc.next();
        int len = name.length();
        for (int i = 0; i <= len; i++) {// for (int i = len; i > 0; i--)
            for (int j = 0; j < i; j++) {// for (int j = 0; j <= i; j++)
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}
