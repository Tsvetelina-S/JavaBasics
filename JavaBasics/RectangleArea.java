package JavaBasics;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int side = Integer.parseInt(scan.nextLine());
                int area = side * side;
                System.out.println(area);
    }
}
