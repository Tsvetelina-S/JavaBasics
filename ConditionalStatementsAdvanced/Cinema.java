package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeProjection = scan.nextLine();
        double rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double seats = rows * columns;
        double price = 0;
        if (typeProjection.equals("Premiere")){
            price = seats * 12.00;
        }else if (typeProjection.equals("Normal")){
            price = seats * 7.50;
        }else if (typeProjection.equals("Discount")){
            price = seats * 5.00;
        }
        System.out.printf("%.2f leva",price);

    }
}
