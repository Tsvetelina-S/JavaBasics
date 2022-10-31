package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String presentationName = scan.nextLine();
        double sumAverageGrades = 0;
        double sumPresentations = 0;
        double sum = 0;
        while (!presentationName.equals("Finish")){
            sumPresentations ++;
            for (int i = 0; i < n; i++) {
                double grades = Double.parseDouble(scan.nextLine());
                sum += grades;
            }
            double averageGrade = (sum/n);
            sumAverageGrades += averageGrade;
            System.out.printf("%s - %.2f.%n",presentationName,averageGrade);
            sum = 0;
            presentationName = scan.nextLine();
        }
        double averageAllPresentations = sumAverageGrades/sumPresentations;
        System.out.printf("Student's final assessment is %.2f.",averageAllPresentations);
    }
}
