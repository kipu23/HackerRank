import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    private static DecimalFormat df = new DecimalFormat("#.0");

    private static double getMean (ArrayList<Integer> numbers){

        double sumNumbers = 0;
        for (Integer currentNumber : numbers){
            sumNumbers = sumNumbers + currentNumber;
        }

        return (sumNumbers/numbers.size());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }

        double mean = getMean(numbers);

        double squareDistanceFromMean = 0;

        for (int i = 0; i < n; i++){
            squareDistanceFromMean = squareDistanceFromMean + Math.pow((numbers.get(i)-mean),2);
        }

        System.out.println(df.format(Math.sqrt((squareDistanceFromMean/n))));

    }
}