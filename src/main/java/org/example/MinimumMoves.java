package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinimumMoves {
    /*There are two arrays of integers, arr1 and arr2.
    Determine the minimum number of moves to match arr1
    with arr2
     */

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(123);
        arr1.add(543);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(321);
        arr2.add(279);

        System.out.println(arr1.toString());

        String str1 = "";
        String str2 = "";

        for(int i=0; i<=arr1.size()-1;i++){
            str1 = str1 + String.valueOf(arr1.get(i));
            str2 = str2 + String.valueOf(arr2.get(i));
        }

        System.out.println(str1 + " "+str2);
        int dif = 0;

        for(int i=0; i<=str1.length()-1;i++){
            dif = dif + Math.abs(Integer.valueOf(str1.charAt(i))-Integer.valueOf(str2.charAt(i)));
        }

        System.out.println(dif);

    }
}
