package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayOfTheWeek = scan.nextLine();
        int priceOfTheTicket = 0;
        if (dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Friday")){
            priceOfTheTicket = 12;
        } else if (dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday")){
            priceOfTheTicket = 14;
        } else if (dayOfTheWeek.equals("Saturday") || (dayOfTheWeek.equals("Sunday"))){
            priceOfTheTicket = 16;
        }
        System.out.println(priceOfTheTicket);
    }
}
