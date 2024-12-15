import java.util.Scanner;
class SmallestBetweenFour {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();

        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
        }
        else if(num3 < smallest){
            smallest = num3;
        }
        else{
            smallest = num4;
        }

        System.out.println(smallest);
    }
}
