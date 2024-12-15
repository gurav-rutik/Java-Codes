import java.util.Scanner;

public class Reverse_Array {

    public static void main(String[] args) {
        int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        size = s.nextInt();
        int a[] = new int[100];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Before Reversing: \n");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        System.out.print("After Reversing: \n");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}