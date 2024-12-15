
import java.util.Arrays;

class Practice{
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr3.length;i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[k++];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}