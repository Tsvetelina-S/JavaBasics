package WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favBook = scan.nextLine();
        String book = scan.nextLine();
        int sum = 0;
        while (!book.equals("No More Books")){
            if (book.equals(favBook)){
                break;
            }else{
                book = scan.nextLine();
            }
            sum ++;
        }
        if (book.equals(favBook)){
            System.out.printf("You checked %d books and found it.",sum);
        } else {
            System.out.printf("The book you search is not here! %nYou checked %d books.", sum);
        }

    }
}
