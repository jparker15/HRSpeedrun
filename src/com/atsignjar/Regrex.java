package com.atsignjar;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Regrex {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Pattern pattern = Pattern.compile("@gmail.com");

            ArrayList<String> gmailAccounts = new ArrayList<>();


            for (int NItr = 0; NItr < N; NItr++) {
                String[] firstNameEmailID = scanner.nextLine().split(" ");

                String firstName = firstNameEmailID[0];

                String emailID = firstNameEmailID[1];

                Matcher matcher = pattern.matcher(emailID);
                boolean matchFound = matcher.find();

                if(matchFound){
                    gmailAccounts.add(firstName);
                }

            }
            Collections.sort(gmailAccounts);
            for(String acc: gmailAccounts){
                System.out.println(acc);
            }



            scanner.close();
        }


}
