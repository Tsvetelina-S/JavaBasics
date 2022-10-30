package WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nMax = Integer.MIN_VALUE;
        String input = scan.nextLine();
        while(!input.equals("Stop")){
            int n = Integer.parseInt((input));
            if (nMax < n ){
                nMax = n;
            }
            input = scan.nextLine();
        }
        System.out.println(nMax);
    }
}
