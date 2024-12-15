/*
 * Write a method to find the frequency of each element in 
 * the given integer array.
    Test Case 1: 

	Input :  [1, 8, 6 , 1 , 0 , 8]
	Output :    1 : 2 
                8 : 2 
                6 : 1 
                0 : 1 ​


Test Case 2: 

	Input :   [ 2, 2 , 3 , 3 , 2]
	Output :    2 : 3 
                3 : 2 

 */



// import java.util.HashMap;
// import java.util.Map;

// public class ArrayFrequencyFind {
//     public static void main(String[] args) {
//         int[] arr = {1, 8, 6, 1, 0, 8};
//         findFrequency(arr);
//     }

//     public static void findFrequency(int[] arr) {
//         Map<Integer, Integer> frequencyMap = new HashMap<>();

//         for (int num : arr) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         System.out.println("Frequency of each element in the array:");
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
//         }
//     }
// }



import java.util.Scanner;

class ArrayFrequencyFind {

    // public static void frequencyCount(int[] array){
    //     // logic 
    //     // s1: 
    //     int visited = Integer.MIN_VALUE ; 
    //     // s2 : find frequency
    //     for( int i = 0 ; i < array.length ; i++ ){
    //         // check if it is visited or not 
    //         int count = 1 ; 
    //         if( array[i] != visited ){
    //             // not visited 
    //             // frequency for ith element 
    //             for( int j = i+1 ; j < array.length ; j++ ){
    //                 // check if ith element is same as jth element
    //                 if( array[i] == array[j]){
    //                     count++  ; 
    //                     // replace the visited data 
    //                     array[j] = visited ; 
    //                 }// end of if 
    //             }// end of inner for 
    //             System.out.println(array[i] + " : " + count);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] a = {1, 8, 6 , 1 , 0 , 8} ; 
    //     frequencyCount(a);
    // }



    public static void findFrequency(int arr[]) {
        int size = arr.length;
        boolean visited[] = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ": " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        findFrequency(arr);

        sc.close();
    }
}
