package NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        for (int num = 0; num <= n; num++) {
            for (int num2 = 0; num2 <= n; num2++) {
                for (int num3 = 0; num3 <= n; num3++) {
                    if (num + num2 + num3 == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
