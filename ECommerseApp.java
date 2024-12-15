
/*
 * For an Ecommerce application we need to write a logic to calculate the total price of 
 * the purchase after applying the discount. The discount are as follows,

If the customer is a teenager, flat discount 5%. If the total purchase price is above 5000 
after the flat discount customer gets additional 5% discount.

If the customer is in 20's flat discount 6%. If the total purchase price is above 4000 after 
the flat discount customer gets additional 6% discount.

If the customer is aged above 29 flagdiscount 15%.

Assume the age and total purchase price is given as Inov

ite a program to calculate the total price of purchase

ter discount and display, total price before

discount, total price after discount, discounted amount if

any.

Test Case 1:

Input age:12

Input total price:200

Output:200

200

Test Case 2:

Input age: 19

Spiders

Input total price: 2000

Output:2000

1900

100

Test Case 3:

Input age:21

Input total price:10000

Output:10000

8836

1164
 */

import java.util.Scanner;

class ECommerseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double totalPrice = sc.nextDouble();
        double price_after_discount = totalPrice;

        if(age>=13 && age<=19){
            price_after_discount = totalPrice - (totalPrice * 0.05);

            if(price_after_discount > 5000){
                price_after_discount = price_after_discount - (price_after_discount * 0.05);
            }
        }else if(age >=20 && age <=29){
            price_after_discount = totalPrice - (totalPrice * 0.06);

            if(price_after_discount > 4000){
                price_after_discount = price_after_discount - (price_after_discount * 0.06);
            }
        }
        else if(age >=30){
            price_after_discount = totalPrice - (totalPrice * 0.15);
        }
        System.out.println(totalPrice);
        System.out.println(price_after_discount);
        System.out.println(totalPrice - price_after_discount);

    }
}
