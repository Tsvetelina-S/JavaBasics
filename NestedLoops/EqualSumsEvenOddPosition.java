package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int countOdd = 0;
        int countEven = 0;
        int sum = 0;
        int m =0;
        int number = 0;

        for (int i = a; i <= b ; i++) {
            number = i;
            countEven = 0;
            countOdd = 0;
            for (int position = 1; position <=6; position++) {
                sum = number % 10;
                m = number / 10;
                if (position % 2 == 0) {
                    countEven += sum;
                }
                if (position % 2 != 0) {
                    countOdd += sum;
                }
                number = m;
            }
            if (countEven == countOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
