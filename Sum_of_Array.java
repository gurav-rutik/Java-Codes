import java.util.Scanner;

class Sum_of_Array {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do you want to enter : ");
        int arr = sc.nextInt();
        int array[] = new int[arr];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < arr; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < arr; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of array element = " + sum);
    }
}
