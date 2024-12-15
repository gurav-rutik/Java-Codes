import java.util.Scanner;

class Min_Array {
    public static void main(String[] args) {
        int i, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int arr = sc.nextInt();
        int array[] = new int[arr];
        System.out.println("Enter the array element : ");
        for (i = 0; i < arr; i++) {
            array[i] = sc.nextInt();
        }
        min = array[0];
        for (i = 0; i < arr; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum Array : " + min);
    }
}
