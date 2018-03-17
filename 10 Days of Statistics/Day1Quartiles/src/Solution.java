import java.io.*;
import java.util.*;

public class Solution {

    public static int getMedian (ArrayList<Integer> numbers){

        Collections.sort(numbers);

        if (numbers.size()%2 == 1){
            return numbers.get(numbers.size()/2);
        } else {
            return ((numbers.get(numbers.size()/2) + numbers.get(numbers.size()/2-1))/2);
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            numbers.add(scan.nextInt());
        }

        int q2 = getMedian(numbers);

        ArrayList<Integer> lowerHalf = new ArrayList<>();
        ArrayList<Integer> upperHalf = new ArrayList<>();

        for (Integer number : numbers){
            if (number > q2) {
                upperHalf.add(number);
            }
            if (number < q2) {
                lowerHalf.add(number);
            }
        }

        System.out.println(getMedian(lowerHalf));
        System.out.println(getMedian(numbers));
        System.out.println(getMedian(upperHalf));

    }
}