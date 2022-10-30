package WhileLoop;

import java.util.Scanner;

public class Walking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = 10000;
        int sum = 0;
        String input = scan.nextLine();
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            sum += steps;
            if (sum >= target) {
                sum -= target;
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Going home")) {
            int overAllSteps = Integer.parseInt(scan.nextLine());
            int allSteps = overAllSteps + sum;
            if (allSteps < target) {
                System.out.printf("%d more steps to reach goal.", target - allSteps);
            } else {
                System.out.printf("Goal reached! Good job!\n" +
                        "%d steps over the goal!", allSteps - target);
            }
        }else{
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", sum);
        }
    }
}
