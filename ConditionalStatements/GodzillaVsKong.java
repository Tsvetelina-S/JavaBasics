package ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double pricePerOneCloth = Double.parseDouble(scan.nextLine());

        double pricePerAllCloths = pricePerOneCloth * statists;

        double decor= budget * 0.1;

        if (statists > 150){
            pricePerAllCloths= pricePerAllCloths - (pricePerAllCloths * 0.1);
        }

        double decorAndCloths = decor + pricePerAllCloths;
        double moneyRest = budget - decorAndCloths;
        double moneyOver = decorAndCloths - budget;
        if (decorAndCloths > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyOver );
        } else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyRest);
        }
    }
}
