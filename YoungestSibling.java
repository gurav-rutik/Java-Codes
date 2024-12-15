import java.util.Scanner;
class YoungestSibling {
    public static void main(String[] args) {
        int ramu, raghu, raju;
        Scanner sc = new Scanner(System.in);
        ramu = sc.nextInt();
        raghu = sc.nextInt();
        raju = sc.nextInt();

        if(ramu<0 || raghu<0 || raju<0){
            System.out.println("age is invalid");
        }else if(ramu<raghu && ramu<raju){
            System.out.println(ramu);
        }else if(raghu<raju){
            System.out.println(raghu);
        }else{
            System.out.println(raju);
        }
        
        // if(ramu<raju){
        //     if(ramu<raghu){
        //         System.out.println(ramu);
        //     }else{
        //         System.out.println(raghu);
        //     }
        // }else{
        //     if(raghu<raju){
        //         System.out.println(raghu);
        //     }else{
        //         System.out.println(raju);
        //     }
        // }
    }
}
