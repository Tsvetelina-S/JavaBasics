package JavaBasics;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int high = Integer.parseInt(scan.nextLine());
        double extras = Double.parseDouble(scan.nextLine());
        int capacity = length * width * high;
        double capacityL = capacity * 0.001;
        double convertedExtras = extras * 0.01;
        double overallL = capacityL * (1-convertedExtras);
        System.out.printf(" %.2f",overallL);
    }
}
