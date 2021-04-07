package com.atsignjar;
import java.io.*;
import java.util.*;


public class Loop {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int cases = scanner.nextInt();
        String s = "";

        for(int j = 0; j < cases; j++){
            s = scanner.next();
            String even = "";
            String odd= "";

            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0){
                    even += s.charAt(i);

                }else{
                    odd += s.charAt(i);
                }
            }

            System.out.println(even + " " + odd);
        }


    }
}
