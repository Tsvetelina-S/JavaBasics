package ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int myMaxNumber = Integer.MIN_VALUE; //5,20,80
        int myMinNumber = Integer.MAX_VALUE; //5,
        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scan.nextLine());
            if (number < myMinNumber){
                myMinNumber = number;
            }
            if (number > myMaxNumber){
                myMaxNumber = number;
            }
        }
        System.out.printf("Max number: %d %nMin number: %d",myMaxNumber,myMinNumber);
    }
}
