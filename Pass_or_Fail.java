import java.util.Scanner;

class Pass_or_Fail {
    public static void main(String[] args) {

        int phy, che, math, mar, eng, geo;
        float total, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics : ");
        phy = sc.nextInt();
        System.out.println("Enter the marks of Chemistry : ");
        che = sc.nextInt();
        System.out.println("Enter the marks of Maths : ");
        math = sc.nextInt();
        System.out.println("Enter the marks of Marathi : ");
        mar = sc.nextInt();
        System.out.println("Enter the marks of English : ");
        eng = sc.nextInt();
        System.out.println("Enter the marks of Geography : ");
        geo = sc.nextInt();

        total = (phy + che + math + mar + eng + geo);
        avg = (total / 600) * 100;
        if ((avg < 40) || (phy < 33) || (che < 33) || (math < 33) || (mar < 33) || (eng < 33) || (geo < 33)) {
            System.out.println("Your total percentage is " + avg + " and you are fail!!");
        } else {
            System.out.println("Your total percentage is " + avg + " and you are pass!!");
        }
    }
}
