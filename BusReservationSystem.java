import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class BusReservationSystem {

    public static void main(String[] args) {
        FileWriter file = null;
        PrintWriter pw = null;
        Scanner scanner = new Scanner(System.in);

        try {
            file = new FileWriter("test.txt");
            pw = new PrintWriter(file);

            int capacity, res;
            System.out.print("Enter the capacity of Bus : ");
            capacity = scanner.nextInt();
            System.out.print("Enter the reservation seats of Bus : ");
            res = scanner.nextInt();

            int[] arr = new int[res];

            for (int i = 0; i < res; i++) {
                System.out.printf("Enter seat number of member %d between 1 to %d to be reserved : ", i + 1, capacity);
                arr[i] = scanner.nextInt();
            }

            pw.println("\n************************************************************************************************");
            pw.println("\n***************************** WEL COME TO BUS RESERVATION SYSTEM *******************************");
            pw.println("\n************************************************************************************************\n");
            pw.printf("DATE : %s\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t TIME : %s\n", getCurrentDate(), getCurrentTime());
            pw.println("\t\t\t\t\t\t\t----------------------------------");
            pw.println("\t\t\t\t\t\t\t| \tSEAT NO.   |      STATUS     |");
            pw.println("\t\t\t\t\t\t\t----------------------------------");

            for (int i = 1; i <= capacity; i++) {
                boolean booked = false;
                for (int j = 0; j < res; j++) {
                    if (i == arr[j]) {
                        booked = true;
                        break;
                    }
                }
                if (booked)
                    pw.printf("\t\t\t\t\t\t\t| \t\t%d\t   |     BOOKED      |\n", i);
                else
                    pw.printf("\t\t\t\t\t\t\t| \t\t%d\t   |     EMPTY       |\n", i);
            }
            pw.println("\t\t\t\t\t\t\t----------------------------------");

            pw.println("\n************************************************************************************************");
            pw.println("\n********************************* THANK YOU FOR VISITING ***************************************");
            pw.println("\n************************************************************************************************\n");

            System.out.println("Successfully created....!!!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            scanner.close();
        }
    }

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return timeFormat.format(date);
    }
}
