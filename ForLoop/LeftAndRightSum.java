package ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1;i <= n; i ++) {
            int numbers = Integer.parseInt(scan.nextLine());
            sum1 += numbers;
        }
        for (int b =1; b <= n;b++){
            int numbers2 = Integer.parseInt(scan.nextLine());
            sum2 +=numbers2;
        }
        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        }else {
            System.out.println("No, diff = " + Math.abs(sum1 - sum2));
        }
    }
}
