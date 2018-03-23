import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        int[] numbers = new int[T];

        for (int i = 0; i < T; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int currentNumber : numbers) {

            int maxDivisor;
            int currentDivisor = 2;
            boolean isPrime = true;
            //System.out.println("CurrentNumber: " + currentNumber);

            if (currentNumber <= 1) {
                isPrime = false;
            }

            if ((currentNumber == 2) || (currentNumber == 3)){
                isPrime = true;
            }

            if (currentNumber > 3) {
                do {

                    //  System.out.println("CurrentDivisor: " + currentDivisor);
                    //  System.out.println("MaxDivisor: " + maxDivisor);

                    if ((currentNumber % currentDivisor) == 0) {
                        isPrime = false;
                        break;
                    } else {

                        maxDivisor = currentNumber/currentDivisor;
                        currentDivisor++;
                    }

                } while (maxDivisor >= currentDivisor);
            }
            //System.out.println();



            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }


        }

        scan.close();

    }
}
