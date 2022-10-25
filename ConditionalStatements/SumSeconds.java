package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());
        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        System.out.printf("%d:%02d", minutes, seconds);
    }
}
