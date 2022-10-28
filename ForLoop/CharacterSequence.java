package ForLoop;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int i =0;
        for (i = 0; i < name.length(); i++){
            char letter = name.charAt(i);
            System.out.println(letter);

        }
    }
}
