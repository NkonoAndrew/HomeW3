package edu.sjsu;

import java.util.Scanner;

public class TimeDifference {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int hourDifference = 0;

        System.out.println("Please enter the first time in 24 hours:");
        String stringTime1 = input.next();

        while (stringTime1.length() > 4 || stringTime1.length() < 4) {
            System.out.println("Time 1 format incorrect! Please enter a correct time format: ");
            stringTime1 = input.next();
            int time1 = Integer.parseInt(stringTime1);

        }
        int time1 = Integer.parseInt(stringTime1);


        System.out.println("Please enter the second time in 24 hours:");
        String stringTime2 = input.next();

        while (stringTime2.length() > 4 || stringTime2.length() < 4) {
            System.out.println("Time 2 format incorrect! Please enter a correct time format: ");
            stringTime2 = input.next();
            int time2 = Integer.parseInt(stringTime2);
        }
        int time2 = Integer.parseInt(stringTime2);


        int hour1 = time1 / 100;
        int hour2 = time2 / 100;

        if (hour2 < hour1) {
            int h1 = 24 - hour1;
            int hourDifference1 = Math.abs(h1 + hour2);

            int min1 = time1 % 100;
            int min2 = time2 % 100;

            int minuteDifference = Math.abs(min2 - min1);

            System.out.println(hourDifference1 + " hour(s) " + minuteDifference + " minutes");
        }

        else{
        hourDifference  = Math.abs(hour2 - hour1);
            int min1 = time1 % 100;
            int min2 = time2 % 100;

            int minuteDifference = Math.abs(min2 - min1);

            System.out.println(hourDifference + " hour(s) " + minuteDifference + " minutes");
        }

    }
}
