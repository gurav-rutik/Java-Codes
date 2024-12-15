import java.util.Scanner;

class Copy_array {
    public static void main(String[] args) {

        int arr, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        arr = sc.nextInt();
        int array[] = new int[arr];
        int array1[] = new int[arr];

        System.out.println("Enter the array element : ");
        for (i = 0; i < arr; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The First array element are : ");

        for (i = 0; i < arr; i++) {
            System.out.println(array[i]);
        }
        System.out.println("After copping : ");
        for (i = 0; i < arr; i++) {
            array1[i] = array[i];
        }
        System.out.println("The Second array element are : ");

        for (i = 0; i < arr; i++) {
            System.out.println(array1[i]);
        }
    }
}
