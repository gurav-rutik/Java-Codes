
import java.util.Scanner;

//fibonacci series

class FibonacciSeries {
  public static void main(String[] args) {
    int a=0,b=1,c;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(a + " " + b);
    for (int i=2; i<num; ++i) {
      c = a + b;
      a = b;
      b = c;
      System.out.print(" " +b);
  }
}
}

