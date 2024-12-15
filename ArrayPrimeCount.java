import java.util.Scanner;

class ArrayPrimeCount{

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int countPrime(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = countPrime(arr);
        System.out.println(result);
    }
}