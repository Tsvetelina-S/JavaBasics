package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        //boolean isResult = false;
        for(int i = n1; i <= n2; i++) {
            for (int m = n1; m <= n2; m++) {
                count++;
                if (i + m == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, m, magicNumber);
                    //isResult = true;
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",count,magicNumber);
    }
}
