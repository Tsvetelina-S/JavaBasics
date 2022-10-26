package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N1 = Double.parseDouble(scan.nextLine());
        double N2 = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double result = 0;
        String evenOrOdd = " ";
        if (operator.equals("+")){
            result = N1 + N2;
            if (result % 2 == 0 ){
                evenOrOdd = "even";
            }else{
                evenOrOdd = "odd";
            }
            System.out.printf("%.0f + %.0f = %.0f - %s",N1,N2,result,evenOrOdd);
        }else if (operator.equals("-")){
            result = N1 - N2;
            if (result % 2 == 0 ){
                evenOrOdd = "even";
            }else{
                evenOrOdd = "odd";
            }
            System.out.printf("%.0f - %.0f = %.0f - %s",N1,N2,result,evenOrOdd);

        }else if (operator.equals("/")){
            if (N2 != 0) {
                result = N1 / N2;
                System.out.printf("%.0f / %.0f = %.2f",N1,N2,result);
            }else {
                System.out.printf ("Cannot divide %.0f by zero",N1);
            }

        }else if (operator.equals("*")){
            result = N1 * N2;
            if (result % 2 == 0 ){
                evenOrOdd = "even";
            }else{
                evenOrOdd = "odd";
            }
            System.out.printf("%.0f * %.0f = %.0f - %s",N1,N2,result,evenOrOdd);
        }else if (operator.equals("%")){
            if (N2 != 0) {
                result = N1 % N2;
                System.out.printf("%.0f %% %.0f = %.0f",N1,N2,result);
            }else {
                System.out.printf ("Cannot divide %.0f by zero",N1);
            }
        }
    }
}
