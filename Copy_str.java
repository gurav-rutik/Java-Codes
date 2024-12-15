import java.util.Scanner;

class Copy_str {
    public static void main(String[] args) {
        String name, name1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        name = sc.nextLine();
        name1 = name;
        System.out.println("Before copping = " + name);
        System.out.println("After copping = " + name1);
    }
}
