
import java.util.Scanner;
/*
 * Write a program to calculate the discount on a t-shirt based on the total amount purchased.

If the total amount is greater than 500, apply a discount of 10%.

If the total amount is greater than 250 but less than or equal to 500, apply a discount of 5%.

Prompt the user to input the total amount of their purchase, and then display the discounted amount they need to pay.
 */
class DiscountCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total_amount = sc.nextDouble();
        double discounted_amount = total_amount;
        
        if(total_amount>0){
            if(total_amount > 500){
                discounted_amount = total_amount - (total_amount * 0.10);
            }else if(total_amount>250 || total_amount <= 500){
                discounted_amount =  discounted_amount - (discounted_amount * 0.05);
            }
            System.out.println(discounted_amount);
        }else{
            System.out.println(total_amount-total_amount);
        }
    }

}
