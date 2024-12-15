
import java.util.Scanner;

class CountString{
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        for(int i=0;i<len;i++){
            count++;
        }
        System.out.println(count);
    }
}