import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    public static DecimalFormat df = new DecimalFormat("#.0");

    public static int T;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int currentNumber = sc.nextInt();
            numbers.add(currentNumber);
        }
        sc.close();

        printMean(numbers);
        printMedian(numbers);
        printMode(numbers);

    }

    public static void printMean (ArrayList<Integer> numbers){
        Integer sum =0;
        for (Integer currentNum : numbers){
            sum = sum + currentNum;
        }
        double mean = sum.doubleValue()/numbers.size();
        System.out.println(df.format(mean));

    }

    public static void printMedian (ArrayList<Integer> numbers) {

        Collections.sort(numbers);
        double median;

        if ((numbers.size() % 2) == 1){
            median = numbers.get(numbers.size()/2);
            // odd - keresd meg a középsőt
        } else {
            median = ( numbers.get(numbers.size()/2).doubleValue() + numbers.get(( numbers.size()/2 )-1).doubleValue() ) / 2 ;
            // even - keresd meg a középső kettő átlagát
        }
        System.out.println(df.format(median));
    }

    public static void printMode (ArrayList<Integer> numbers) {

        Collections.sort(numbers);
        int maxCount = 0;
        Integer mode = numbers.get(0);

        for (Integer currentNum : numbers){
            int count = 0;
            for (Integer searchNum: numbers){
                if (searchNum.intValue() == currentNum.intValue()) {
                    count++;
                }
                if (count > maxCount){
                    maxCount = count;
                    mode = searchNum;
                }
            }
        }

        System.out.println(mode);

    }


    public static void mode(ArrayList<Integer> input) {

        int[] count = new int[T];

        //count the occurrences
        for (int i=0; i < input.size(); i++) {
            count[input.get(i)]++;
        }

        //go backwards and find the count with the most occurrences
        int index = count.length-1;
        for (int i=count.length-2; i >=0; i--) {
            if (count[i] >= count[index])
                index = i;
        }

        System.out.println(index);
    }


}