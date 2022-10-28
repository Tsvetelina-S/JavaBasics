package ForLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //high
        String text = scan.nextLine();
        int sum = 0;
        for (int y = 0; y < text.length();y++){
            char letter = text.charAt(y);
            switch (letter){
                case 'a':
                    sum ++;
                    break;
                case 'e':
                    sum +=2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }
        System.out.println(sum);

    }
}
