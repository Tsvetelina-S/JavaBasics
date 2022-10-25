package ConditionalStatements;

import java.util.Scanner;

public class TimeFifteenMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int minAndFifteen = minutes + 15;
        int hourAndFifteen = hour;
        int extraHours = 0;

        if ( minutes > 44) {
            hourAndFifteen = hourAndFifteen + (minAndFifteen / 60); // 23: 59 - 00:14
            minAndFifteen = minAndFifteen - 60; //
        }

        if ( hourAndFifteen ==24){
            System.out.printf("0:%02d", minAndFifteen);
        } else {
            System.out.printf("%d:%02d", hourAndFifteen, minAndFifteen);
        }

    }
}
