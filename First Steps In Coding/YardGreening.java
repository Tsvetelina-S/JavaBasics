package JavaBasics;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double m2 = Double.parseDouble(scan.nextLine());
        double finalPrice = m2 * 7.61;
        double discount = 0.18 * finalPrice;
        finalPrice = finalPrice - discount;
        System.out.println ("The final price is: " + finalPrice + " lv.");
        System.out.println ("The discount is: " + discount + " lv.");
    }
}
