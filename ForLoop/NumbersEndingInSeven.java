package ForLoop;

import java.util.Scanner;

public class NumbersEndingInSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        for (int i = 7; i <= 1000; i+=10){
//            System.out.println(i);
//        }
        for (int i = 1;i <= 1000; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
