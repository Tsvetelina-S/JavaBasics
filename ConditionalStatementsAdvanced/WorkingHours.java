package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int workingHours = Integer.parseInt(scan.nextLine());
        String dayOfTheWeek = scan.nextLine();
        if (((dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Tuesday") || dayOfTheWeek.equals("Wednesday") || dayOfTheWeek.equals("Thursday") || dayOfTheWeek.equals("Friday") || dayOfTheWeek.equals("Saturday")) && workingHours >= 10 && workingHours <= 18)){
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
