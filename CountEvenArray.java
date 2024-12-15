import java.util.Scanner;

class CountEvenArray {
    public static int EvenArr(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
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
        System.out.println(EvenArr(arr));
    }
}
