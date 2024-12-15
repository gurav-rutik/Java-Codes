import java.util.Scanner;

class MergeSortEx {
    public static int[] merge(int a1[], int a2[]){
        int size1 = a1.length;
        int size2 = a2.length;

        int a[] = new int[size1+size2];
        int i=0,j=0,k=0;

        while(i<size1 && j<size2){
            if(a1[i]<a2[j]){
                a[k++] = a1[i++];
            }else{
                a[k++] = a2[j++];
            }
        }

        while(i<size1){
            a[k++] = a1[i++];
        }

        while(j<size2){
            a[k++] = a2[j++];
        }
        return a;
    }
    public static void printArr(int a[]){
        for(int i=00;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int a1[] = new int[size1];
        for(int i=0; i<size1; i++) {
            a1[i] = sc.nextInt();
        }

        int a2[] = new int[size2];
        for(int i=0; i<size2; i++) {
            a2[i] = sc.nextInt();
        }

        int res[] = merge(a1, a2);
        printArr(res);
    }
}
