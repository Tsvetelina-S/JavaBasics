package ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        sum = sum - maxNumber;
        if (maxNumber == sum) {
            System.out.printf("Yes%nSum = %d", maxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - maxNumber));
        }

    }
}
