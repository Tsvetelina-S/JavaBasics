package NestedLoops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int et = Integer.parseInt(scan.nextLine());
        int room = Integer.parseInt(scan.nextLine());
        int sum = et;
        for (int i = et; i > 0; i--){ //6,5,
            for(int m = 0;m < room; m++){
                if (sum == et) {
                    System.out.printf("L%d%d ", i, m);
                }
                if (i % 2 != 0 && sum != et){
                    System.out.printf("A%d%d ", i, m);
                }
                if (i % 2 == 0 && sum != et){
                    System.out.printf("O%d%d ", i, m);
                }
            }
            sum--;
            System.out.println(" ");
        }
    }
}
