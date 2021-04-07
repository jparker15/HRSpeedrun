package com.atsignjar;
import java.util.*;
import java.io.*;

public class DictionAndMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> hash = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hash.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hash.get(s) != null){
                System.out.println(s + "=" + hash.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
