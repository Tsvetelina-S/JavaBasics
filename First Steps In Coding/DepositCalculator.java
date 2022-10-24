package JavaBasics;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deposit = Integer.parseInt(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());
        double sum = deposit + months * ((deposit * (interestRate/100)/12));
        System.out.println(sum);
    }
}
