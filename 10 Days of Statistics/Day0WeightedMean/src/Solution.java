import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        //scan no of numbers
        int n = scan.nextInt();

        //scan the numbers
        scan.nextLine();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }

        //scan the weights
        scan.nextLine();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++){
            weights[i] = scan.nextInt();
        }

        Integer numerator = 0;
        Integer denominator = 0;

        for (int i = 0; i < n; i++){
            numerator += (numbers[i]*weights[i]);
        }

        for (int i = 0; i < n; i++){
            denominator += weights[i];
        }

        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(df.format(numerator.doubleValue()/denominator.doubleValue()));

    }
}