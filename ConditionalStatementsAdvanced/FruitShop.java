package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String dayOfTheWeek = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;
        if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday")) {
            if (product.equals("banana")) {
                price = quantity * 2.50;
                System.out.printf("%.2f",price);
            } else if (product.equals("apple")) {
                price = quantity * 1.20;
                System.out.printf("%.2f",price);
            } else if (product.equals("orange")) {
                price = quantity * 0.85;
                System.out.printf("%.2f",price);
            } else if (product.equals("grapefruit")) {
                price = quantity * 1.45;
                System.out.printf("%.2f",price);
            } else if (product.equals("kiwi")) {
                price = quantity * 2.70;
                System.out.printf("%.2f",price);
            } else if (product.equals("pineapple")) {
                price = quantity * 5.50;
                System.out.printf("%.2f",price);
            } else if (product.equals("grapes")) {
                price = quantity * 3.85;
                System.out.printf("%.2f", price);
            }else{
                System.out.println("error");
            }
        } else if (dayOfTheWeek.equals("Saturday") || (dayOfTheWeek.equals("Sunday"))) {
            if (product.equals("banana")) {
                price = quantity * 2.70;
                System.out.printf("%.2f",price);
            } else if (product.equals("apple")) {
                price = quantity * 1.25;
                System.out.printf("%.2f",price);
            } else if (product.equals("orange")) {
                price = quantity * 0.90;
                System.out.printf("%.2f",price);
            } else if (product.equals("grapefruit")) {
                price = quantity * 1.60;
                System.out.printf("%.2f",price);
            } else if (product.equals("kiwi")) {
                price = quantity * 3.00;
                System.out.printf("%.2f",price);
            } else if (product.equals("pineapple")) {
                price = quantity * 5.60;
                System.out.printf("%.2f",price);
            } else if (product.equals("grapes")) {
                price = quantity * 4.20;
                System.out.printf("%.2f",price);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
