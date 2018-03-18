import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        printReverseArray(arr);

    }

    public static void printReverseArray(int[] array){
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
