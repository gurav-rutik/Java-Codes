import java.util.Scanner;

class Insert_Elements_of_Array {
    public static void main(String[] args) {

        int size, pos, item, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        size = sc.nextInt();

        int a[] = new int[100];

        System.out.println("Enter the elements : ");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the postion of array : ");
        pos = sc.nextInt();

        System.out.println("Enter the item of array : ");
        item = sc.nextInt();

        for (i = size; i >= pos; i--) {
            a[i] = a[i - 1];
        }

        a[pos] = item;
        size++;

        System.out.println("Resultant array element are : ");
        for (i = 0; i < size; i++) {
            System.out.println(a[i] + "");
        }
    }
}
