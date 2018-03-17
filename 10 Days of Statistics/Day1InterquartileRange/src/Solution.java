import javafx.scene.input.DataFormat;

import java.io.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Solution {

    private static DecimalFormat df = new DecimalFormat("#.0");

    private static double getMedian(ArrayList<Integer> numbers){
        Collections.sort(numbers);

        if (numbers.size()%2 == 1){
            return (numbers.get(numbers.size()/2).doubleValue());
        } else {
            return (numbers.get(numbers.size()/2).doubleValue() + numbers.get((numbers.size()/2)-1).doubleValue())/2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> frequencies = new ArrayList<>();

        scan.nextLine();
        for (int i = 0; i < n; i++){
            elements.add(scan.nextInt());
        }

        scan.nextLine();
        for (int i = 0; i < n; i++){
            frequencies.add(scan.nextInt());
        }

        ArrayList<Integer> dataSet = new ArrayList<>();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < frequencies.get(i); j ++){
                dataSet.add(elements.get(i));
            }
        }

        double q2 = getMedian(dataSet);

        ArrayList<Integer> upperHalf = new ArrayList<>();
        ArrayList<Integer> lowerHalf = new ArrayList<>();

        for (int i = 0; i < dataSet.size()/2; i++){
            lowerHalf.add(dataSet.get(i));
        }

        for (int i = dataSet.size()-1; i > (dataSet.size()/2); i--){
            upperHalf.add(dataSet.get(i));
        }


//        for (Integer number : dataSet){
//            if (number < q2) {
//                lowerHalf.add(number);
//            }
//            if (number > q2) {
//                upperHalf.add(number);
//            }
//        }

        double q1 = getMedian(lowerHalf);
        double q3 = getMedian(upperHalf);



        System.out.println(df.format(q3-q1));

//        System.out.println(elements.toString());
//        System.out.println(frequencies.toString());
//
//        System.out.println(dataSet.toString());
//
//        System.out.println(getMedian(dataSet));
//
//        System.out.println(lowerHalf.toString());
//        System.out.println(lowerHalf.size());
//        System.out.println(upperHalf.toString());
//        System.out.println(upperHalf.size());
//
//        System.out.println(q1);
//        System.out.println(q3);
    }
}