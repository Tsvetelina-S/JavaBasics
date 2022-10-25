package ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double worldRecordTime = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double timeOneMeter = Double.parseDouble(scan.nextLine());
        double ivansTime = timeOneMeter * meters;
        double delay = Math.floor(meters / 15);
        delay = delay * 12.5;
        ivansTime = ivansTime + delay;
        double difference = ivansTime - worldRecordTime;

        if ( ivansTime < worldRecordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivansTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",difference );
        }

    }
}
