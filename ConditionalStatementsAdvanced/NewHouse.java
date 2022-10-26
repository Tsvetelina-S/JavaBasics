package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        String flower = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        if (flower.equals("Roses")) {
            price = 5 * number;
            if (number > 80) {
                price = price - (price * 0.1);
            }
        } else if (flower.equals("Dahlias")) {
            price = number * 3.80;
            if (number > 90) {
                price = price - (price * 0.15);
            }
        } else if (flower.equals("Tulips")) {
            price = number * 2.80;
            if (number > 80) {
                price = price - (price * 0.15);
            }
        } else if (flower.equals("Narcissus")) {
            price = number * 3;
            if (number < 120) {
                price =price + (price * 0.15);
            }
        } else if (flower.equals("Gladiolus")) {
            price = number * 2.50;
            if (number < 80) {
                price = price + (price * 0.2);
            }

        }
        double leftoverOrNotEnough = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, leftoverOrNotEnough);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", leftoverOrNotEnough);
        }
    }
}
