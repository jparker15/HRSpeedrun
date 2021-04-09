package com.atsignjar;
import java.io.*;
import java.util.*;

public class Binary {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);
        int maxBinary = 0;
        int counter = 0;

        for(int i = 0; i < binary.length(); i++){

            if(binary.charAt(i) == '1'){
                counter += 1;
                if(counter > maxBinary){
                    maxBinary = counter;
                }
            }else{
                counter = 0;
            }
        }

        System.out.println(maxBinary);

        scanner.close();

        
    }
}
