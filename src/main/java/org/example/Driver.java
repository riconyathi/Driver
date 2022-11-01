package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int day = 1;

        Scanner scan = new Scanner(System.in);

        Earnings earnings = new Earnings();

        double openingShare = earnings.inputEarningsOpening(scan);

        while(true){

           double closingShare =  earnings.inputEarningsClosing(scan,day);
            if(closingShare < 0.0 ) break;

           String message = earnings.calculateEarnings(openingShare,closingShare, day);
            System.out.println(message);

            day++;

        }


        scan.close();
    }
}