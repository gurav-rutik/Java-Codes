import java.util.Scanner;

class Max_Array {
    public static void main(String[] args) {
        int i, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int arr = sc.nextInt();
        int array[] = new int[arr];
        System.out.println("Enter the array element : ");
        for (i = 0; i < arr; i++) {
            array[i] = sc.nextInt();
        }
        max = array[0];
        for (i = 0; i < arr; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum array : " + max);
    }
}
