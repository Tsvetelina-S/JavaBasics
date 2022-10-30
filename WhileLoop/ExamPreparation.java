package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int count = 0;
        double gradesSum = 0;
        boolean lowGrades = false;
        int countLowGrades =0;
        String solveAProblem = scan.nextLine();
        String grade = scan.nextLine();
        String problem = "";

        while (!solveAProblem.equals("Enough")) {
            int input = Integer.parseInt(grade);
            gradesSum += input;
            count++;
            if (input <= 4) {
                countLowGrades++;
                if (countLowGrades == number) {
                    lowGrades = true;
                    break;
                }
            }
            solveAProblem = scan.nextLine();
            if (!solveAProblem.equals("Enough")){
                problem = solveAProblem;
                grade = scan.nextLine();
            }
        }
        double averageScore = gradesSum / count;
        if (!lowGrades){
            System.out.printf("Average score: %.2f %nNumber of problems: %d %nLast problem: %s", averageScore, count,problem);
        }else {
            System.out.printf("You need a break, %d poor grades.",countLowGrades);
        }
    }
}
