import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int returnDay = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();
        Calendar returnDate = Calendar.getInstance();
        returnDate.set(returnYear,returnMonth -1, returnDay);

        scan.nextLine();

        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();
        Calendar expectedDate = Calendar.getInstance();
        expectedDate.set(expectedYear,expectedMonth -1, expectedDay);

        int fine = 0;

        if (!returnDate.after(expectedDate)) {
            fine = 0;
        } else {
            final long DAY_IN_MILLIS = 1000 * 60 * 60 * 24;

            int daysBetween = (int) ((returnDate.getTime().getTime() - expectedDate.getTime().getTime())/DAY_IN_MILLIS) + 1;

            int yearBetween = returnDate.get(Calendar.YEAR) - expectedDate.get(Calendar.YEAR);
            int monthBetween = yearBetween * 12 + returnDate.get(Calendar.MONTH) - expectedDate.get(Calendar.MONTH);

           // System.out.println("Daysbetween: "+ daysBetween);
           // System.out.println("MonthBetween: "+ monthBetween);


            if (returnDate.get(Calendar.MONTH) == expectedDate.get(Calendar.MONTH)){
                fine = 15 * daysBetween;
            } else if (returnDate.get(Calendar.YEAR) == expectedDate.get(Calendar.YEAR)){
                fine = 500 * monthBetween;
            } else {
                fine = 10000;
            }

        }

        System.out.println(fine);


    }
}