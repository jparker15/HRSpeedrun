package com.atsignjar;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Scope {
    private int[] elements;
    public int maximumDifference;


/*A class constructor that takes an array of integers as a parameter and saves it to the
instance variable.
A computeDifference method that finds the maximum absolute difference between any
numbers in and stores it in the instance variable.
*/


    // Add your code here
//    Difference (int[] elements){
//        this.elements = elements;
//
//    }

    void computeDifference (){
        int min = elements[0];
        int max = 0;

        for(int i = 0; i < elements.length; i++){
            if(elements[i] > max){
                max = elements[i];
            }
            if(elements[i] < min){
                min = elements[i];
            }
        }
        maximumDifference = max - min;

    }

} // End of Difference class

//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sc.close();
//
//        Difference difference = new Difference(a);
//
//        difference.computeDifference();
//
//        System.out.print(difference.maximumDifference);
//    }
//}
