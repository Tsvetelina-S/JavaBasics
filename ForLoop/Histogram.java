package ForLoop;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double countp1=0;
        double countp2=0;
        double countp3=0;
        double countp4=0;
        double countp5=0;
        for (int i = 1;i <= n;i++){
            double number = Double.parseDouble(scan.nextLine());
            if(number < 200 ){
                countp1++;
            }else if(number <= 399){
                countp2++;
            }else if(number <= 599){
                countp3++;
            }else if (number <= 799){
                countp4++;
            }else if(number >= 800){
                countp5++;
            }

        }
        countp1 = ((countp1/n)*100);
        countp2 = ((countp2/n)*100);
        countp3 = ((countp3/n)*100);
        countp4 = ((countp4/n)*100);
        countp5 = ((countp5/n)*100);
        System.out.printf("%.2f%%%n",countp1);
        System.out.printf("%.2f%%%n",countp2);
        System.out.printf("%.2f%%%n",countp3);
        System.out.printf("%.2f%%%n",countp4);
        System.out.printf("%.2f%%%n",countp5);

    }
}
