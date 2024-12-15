import java.util.Scanner;

class Count_String {
    public static void main(String[] args) {
        String str;
        int i, count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        str = sc.next();
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("String Count = " + count);
    }
}
