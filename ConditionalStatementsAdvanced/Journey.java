package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = " ";
        String accommodation = " ";
        double price = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget - (budget * 0.3);
            } else if (season.equals("winter")) {
                price = budget - (budget * 0.7);
            }
        }else if (budget <= 1000){
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget - (budget * 0.4);
            } else if (season.equals("winter")) {
                price = budget - (budget * 0.8);
            }
        }else if (budget > 1000){
            destination = "Europe";
            price = budget - (budget * 0.9);
        }
        if (season.equals("summer") && !destination.equals("Europe")){
            accommodation = "Camp";
        }else{
            accommodation = "Hotel";
        }
        double moneySpent = 0;
        moneySpent = budget - price;
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",accommodation,moneySpent);

    }
}
