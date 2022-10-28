package ForLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfNumbers = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= numberOfNumbers; i++){
            int number= Integer.parseInt(scan.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
