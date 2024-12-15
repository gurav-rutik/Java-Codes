/*
 * 1: Write a Java Program and write method to print all even numbers between the given range m & n 
 * numbers where m being the lower bound and n being the upper bound
 * case1: 10,20
 * 
 */

 class Array_EvenNoBetweenTwo {
    public static int[] genEven(int m, int n) {
        int count = 0;
        for(int i = m; i <= n; i++) {
            if(i % 2 == 0) {
                count++;
            }
        }

        int[] evenArr = new int[count];
        for(int i = m, index = 0; i <= n; i++) {
            if(i % 2 == 0) {
                evenArr[index++] = i;
            }
        }
        return evenArr;
    }
    
    public static void main(String[] args) {
        int m = 10, n = 20;
        System.out.println("Even numbers between " + m + " and " + n + ":");
        int[] evenNumbers = genEven(m, n);
        
        for(int num : evenNumbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nLength of even numbers is: " + evenNumbers.length);
    }
}
