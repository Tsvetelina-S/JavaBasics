package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        boolean isTrue = true;
        int sum = 1;
        int sumPrime = 0;
        int sumNonPrime = 0;
        int count = 0;
        while (!number.equals("stop")) {
            int num = Integer.parseInt(number);
            for (int i = 0; i < 100; i++) {
                if(num < 0){
                    System.out.printf("Number is negative.%n");
                    isTrue = false;
                    break;
                }else{
                    isTrue = true;
                }
                if (num % sum == 0) {
                    count++;
                }
                if (count >= 3) {
                    break;
                }
                sum++;
            }
            if(isTrue) {
                if (count >= 3) {
                    sumNonPrime += num;
                } else {
                    sumPrime += num;
                }
            }
            count = 0;
            sum = 1;
            number = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrime);
    }
}
