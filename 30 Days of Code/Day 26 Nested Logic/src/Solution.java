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




        System.out.println(returnDate.getTime());
        System.out.println(expectedDate.getTime());





    }
}