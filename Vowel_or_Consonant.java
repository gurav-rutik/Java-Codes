import java.util.Scanner;

class Vowel_or_Consonant {
    public static void main(String[] args) {

        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        c = sc.next().charAt(0);
        switch (Character.toUpperCase(c) & Character.toLowerCase(c)) {
            case 'A':
                // case 'a':
                System.out.println("It is a Vowel.");
                break;
            case 'E':
                // case 'e':
                System.out.println("It is a Vowel.");
                break;
            case 'I':
                // case 'i':
                System.out.println("It is a Vowel.");
                break;
            case 'O':
                // case 'o':
                System.out.println("It is a Vowel.");
                break;
            case 'U':
                // case 'u':
                System.out.println("It is a Vowel.");
                break;
            default:
                System.out.println("It is Not a Vowel..");
        }
        if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I')
                || (c == 'O') || (c == 'U')) {
            System.out.println(c + " is Vowel!!");
        } else {
            System.out.println(c + " is Consonant!!");
        }
    }
}
