import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();



        Map<String, String> emails = new HashMap<>();

        for (int i =0; i < n; i++){
            scan.nextLine();

            String name = scan.next();
            String email = scan.next();

            emails.put(email,name);

        }

        String myRegExString = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(myRegExString, Pattern.CASE_INSENSITIVE);


        List<String> output = new ArrayList<>();

        for (Map.Entry<String, String> entry : emails.entrySet()){

            Matcher m = p.matcher(entry.getKey());

            if( m.matches()) {
                output.add(entry.getValue());
            }

        }

        Collections.sort(output);

        for (String name : output){
            System.out.println(name);
        }



    }
}