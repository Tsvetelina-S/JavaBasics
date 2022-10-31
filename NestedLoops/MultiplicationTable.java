package NestedLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            for(int m = 1; m <= 10; m++ ){
                int result = i * m;
                System.out.printf("%d * %d = %d%n",i,m,result);
            }
        }

    }
}
