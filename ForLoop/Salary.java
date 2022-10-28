package ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());
        for (int i = 1; i <= n; i++ ) {
            String webpage = scan.nextLine();
            if (webpage.equals("Facebook")) {
                salary -= 150;
            }else if (webpage.equals("Instagram")) {
                salary -= 100;
            }
            else if (webpage.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
