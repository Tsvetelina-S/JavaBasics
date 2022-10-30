package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String money = scan.nextLine();
        double sum = 0;
        while (!money.equals("NoMoreMoney")){
            double amount = Double.parseDouble(money);
            if (amount < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                sum += amount;
                System.out.printf("Increase: %.2f%n",amount);
                money = scan.nextLine();
            }

        }
        System.out.printf("Total: %.2f",sum);
    }
}
