package NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();

        while(!destination.equals("End")){
            double budget =  Double.parseDouble(scan.nextLine());
            double sum = 0;
            while (sum < budget){

                double amount = Double.parseDouble(scan.nextLine());
                sum += amount;
            }
            System.out.printf("Going to %s!%n",destination);
            destination = scan.nextLine();
        }
    }
}
