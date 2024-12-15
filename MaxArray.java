
import java.util.Scanner;

class MaxArray {
    public static int LargeArr(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // int arr[] = {12, 34, 56, 78, 90};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // int largest = LargeArr(arr);
        System.out.println(LargeArr(arr));
    }
}
