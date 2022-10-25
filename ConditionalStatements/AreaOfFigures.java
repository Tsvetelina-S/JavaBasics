package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String type = scan.nextLine();

        double area = 0;


        if (type.equals("square")){
            double sideLength = Double.parseDouble(scan.nextLine());
            area = sideLength * sideLength;

        }
        else if (type.equals("rectangle")){
            double sideWidth = Double.parseDouble(scan.nextLine());
            double length = Double.parseDouble(scan.nextLine());
            area = length * sideWidth;
        }
        else if(type.equals("circle")){
            double radius = Double.parseDouble(scan.nextLine());
            area= Math.PI * radius * radius;
        }
        else if (type.equals("triangle")){
            double sideBase = Double.parseDouble(scan.nextLine());
            double side = Double.parseDouble(scan.nextLine());
            area = (sideBase * side)/2;
        }
        System.out.printf("%.3f",area);

    }
}
