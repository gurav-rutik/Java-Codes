import java.util.Scanner;

class Array_user_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array : ");
        int arr = sc.nextInt();
        int array[] = new int[10];
        System.out.println("Enter the element in array : ");
        for (int i = 0; i < arr; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array element are : ");
        for (int i = 0; i < arr; i++) {
            System.out.println(array[i]);
        }
    }
}
