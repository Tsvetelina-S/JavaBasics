package WhileLoop;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        String userPassword = scan.nextLine();
        // System.out.println("Enter password: ");
        String input = scan.nextLine();
        while (!input.equals(userPassword)){
            //System.out.println("Wrong passwod. Enter password: ");
            input = scan.nextLine();
        }
        System.out.println("Welcome " + userName +"!");
    }
}
