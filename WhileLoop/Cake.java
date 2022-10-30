package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int cakeArea = weight * lenght;
        int piecesCake = 0;
        String pieces = scan.nextLine();
        while (!pieces.equals("STOP")) {
            int piece = Integer.parseInt(pieces);
            piecesCake += piece;
            if (piecesCake > cakeArea){
                break;
            }else{
                pieces = scan.nextLine();
            }
        }
        int area = piecesCake - cakeArea;
        if (area < 0){
            System.out.printf("%d pieces are left.", Math.abs(area));
        }else {
            System.out.printf("No more cake left! You need %d pieces more.", area);
        }
    }
}
