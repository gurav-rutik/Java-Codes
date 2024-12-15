import java.util.Scanner;

class Sum_Of_Natural_N0 {
    public static void main(String[] args) {
        float avg;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter : ");
        int num = sc.nextInt();
        /*
         * int array[] = new int[num];
         * System.out.println("Enter the array element : ");
         * for (int i = 0; i < num; i++) {
         * array[i] = sc.nextInt();
         * }
         */
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        avg = sum / (float) 10.0;
        System.out.println("Sum of Natural No = " + sum + "\nAnd Average is = " + avg);
    }
}
