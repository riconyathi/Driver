package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Earnings {


    private DecimalFormat df = new DecimalFormat("0.00");


   public String calculateEarnings(double opening, double closing,int day){

       double earnings =  closing - opening ;
       if(earnings > 0.0 ){
        return "After day "+ day + " , you earned " +
                   df.format(earnings )+" per share.";
       }else if(earnings < 0.0 ){
         return "After day "+ day + " , you lost " +
                   df.format(-earnings )+" per share.";
       }else {
          return  "After day "+ day + " , you have 0 per share.";
       }
    }
    public double inputEarningsOpening(Scanner scan){
        System.out.println("Enter your buying price per share:");
        double buyingPrice = scan.nextDouble();
        return buyingPrice;

    }

    public double inputEarningsClosing(Scanner scan,int day){
        System.out.println("Enter the closing price for day "
                + day + " (any negative value to leave: ");
        double closingPrice = scan.nextDouble();
        if(closingPrice < 0.0 ) {
            return  -0.1;
        }
        return closingPrice;

    }


}
