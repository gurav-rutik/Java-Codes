//create method to return an array
import java.util.Scanner;

class Array_Ex1 {

    public static int[] genIntArray(int size){
        // int num[] = new int[size];
        // return num;
        return new int[size];
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int v1[] = genIntArray(5);
        System.out.println(v1);
        System.out.println(v1.length);
        // for(int i=0; i<v1.length; i++) {
        //     System.out.print(v1[i] + " ");
        // }
    }
}
