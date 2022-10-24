package JavaBasics;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bookPages = Integer.parseInt(scan.nextLine());
        int pagesAnHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int hoursForThisBook =bookPages/pagesAnHour;
        int hours = hoursForThisBook/days;
        System.out.println(hours);
    }
}
