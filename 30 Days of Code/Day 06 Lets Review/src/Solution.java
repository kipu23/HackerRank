import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        String strings[] = new String[T];

        for (int i = 0; i < T; i++){
            strings[i] = scan.nextLine();
        }

        printStringData(strings);

    }

    public static void printStringData(String[] strings){
        for (int i = 0; i < strings.length; i++){
            char[] stringsArray = strings[i].toCharArray();
            String oddChars = "";
            String evenChars = "";
            for (int j = 0; j < stringsArray.length; j++){
                if (j%2 == 0){
                    evenChars = evenChars + stringsArray[j];
                } else {
                    oddChars = oddChars + stringsArray[j];
                }
            }

            System.out.println(evenChars + " " + oddChars);
        }
    }
}