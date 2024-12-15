
import java.util.Scanner;

class CelsiusToFohrenheit {
    public static void main(String[] args) {
        double min_temp=70.0, max_temp=80.0;

        Scanner sc = new Scanner(System.in);
        double current_temp = sc.nextDouble();

        double fahrenheit = (current_temp * 9.0/5) + 32;
        System.out.println(fahrenheit);
        
        if(fahrenheit >= min_temp && fahrenheit <= max_temp){
            System.out.println("Temperature is within range");
        }
    }
}
