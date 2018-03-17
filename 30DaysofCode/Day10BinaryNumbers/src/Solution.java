import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String binary = "";

        while (n > 0){
            int remainder = n%2;
            binary = binary + remainder;
            n = n / 2;
        }

        char[] binaryArray = binary.toCharArray();
        int maxConsecutive1s = 0;
        int counter = 0;

        for (int i = 0; i < binaryArray.length; i++){
            if (binaryArray[i] == '1'){
                counter++;
            }

            if (counter > maxConsecutive1s){
                maxConsecutive1s = counter;
            }

            if (binaryArray[i] == '0') {
                counter = 0;
            }
        }

        System.out.println(maxConsecutive1s);

    }
}