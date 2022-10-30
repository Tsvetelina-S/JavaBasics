package WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nMin = Integer.MAX_VALUE;
        String input = scan.nextLine();
        while(!input.equals("Stop")){
            int n = Integer.parseInt((input));
            if (nMin > n ){
                nMin = n;
            }
            input = scan.nextLine();
        }
        System.out.println(nMin);
    }
}
