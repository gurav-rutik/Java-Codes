import java.util.Scanner;

class MinAndMaxArray{
    public static void minOrmax(int a[]){
        int size = a.length;
        int max=a[0];
        int min = a[0];
        for(int i=0;i<size;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min+","+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        minOrmax(arr);
      
    }
}