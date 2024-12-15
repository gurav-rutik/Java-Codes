import java.util.Arrays;

public class ArrayUnionIntersection {
    
    // Function to find union of two arrays
    public static int[] findUnion(int[] arr1, int[] arr2) {
        // Create a new array to store the union
        int[] union = new int[arr1.length + arr2.length];
        int index = 0;
        
        // Add elements of arr1 to union
        for (int i = 0; i < arr1.length; i++) {
            union[index++] = arr1[i];
        }
        
        // Add elements of arr2 to union (skip if already present)
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[index++] = arr2[i];
            }
        }
        
        // Resize union array to remove unused slots
        return Arrays.copyOf(union, index);
    }
    
    // Function to find intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        // Sort both arrays (assuming arrays are not already sorted)
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Create a new array to store the intersection
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        
        // Find intersection of arr1 and arr2
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else { // arr1[i] == arr2[j]
                // Add to intersection array (skip duplicates)
                if (index == 0 || arr1[i] != intersection[index - 1]) {
                    intersection[index++] = arr1[i];
                }
                i++;
                j++;
            }
        }
        
        // Resize intersection array to remove unused slots
        return Arrays.copyOf(intersection, index);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        int[] unionResult = findUnion(arr1, arr2);
        int[] intersectionResult = findIntersection(arr1, arr2);
        
        System.out.println("Union of the arrays: " + Arrays.toString(unionResult));
        System.out.println("Intersection of the arrays: " + Arrays.toString(intersectionResult));
    }
}