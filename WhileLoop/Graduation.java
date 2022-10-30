package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = 0;
        int countLowGrades = 0;
        double sum = 0;
        boolean lowgrades = false;
        while (count < 12){
            count++;
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                sum += grade;
            }else {
                countLowGrades++;
                if (countLowGrades == 2) {
                    lowgrades = true;
                    break;
                }
            }
        }
        double sumAverage = sum / 12;
        if (lowgrades){
            System.out.printf("%s has been excluded at %d grade",name,(count - 1));
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumAverage);
        }
    }
}
