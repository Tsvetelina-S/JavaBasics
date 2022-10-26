package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int numberFishermen = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (season){
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if(numberFishermen <= 6){
            price = price - (price * 0.1);
        } else if (numberFishermen >= 7 && numberFishermen <= 11){
            price = price - (price * 0.15);
        }else if (numberFishermen >= 12){
            price = price - (price * 0.25);

        }
        if (numberFishermen % 2 == 0 && !season.equals("Autumn")){
            price = price - (price * 0.05);
        }
        double leftoverOrNotEnoughMoney = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", leftoverOrNotEnoughMoney);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",leftoverOrNotEnoughMoney);
        }

    }
}
