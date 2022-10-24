package JavaBasics;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numberOfDogs = Integer.parseInt(scan.nextLine());
        int  numberOfOtherAnimals = Integer.parseInt(scan.nextLine());
        double expenses= ((numberOfDogs * 2.50) + (numberOfOtherAnimals * 4));
        System.out.printf("%.1f lv.", expenses);
    }
}
