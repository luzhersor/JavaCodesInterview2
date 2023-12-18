package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    /*
    Write a Java Program to find the second-highest number in an array.
    int arr[] = { 92, 15, 46, 47, 94, 89, 94, 52, 86, 36, 100, 94, 89 };
     */


    public static void main(String[] args) {

        int arr[] = { 92, 15, 46, 47, 94, 89, 94, 52, 86, 36, 100, 94, 89 };

        /*Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

        System.out.println(arr[arr.length-2]);*/

        List<Integer> arr2 = new ArrayList<>();

        for(int i=0;i<=arr.length-1;i++){
            arr2.add(arr[i]);
        }

        System.out.println(arr2.toString());
        Collections.sort(arr2);
        System.out.println(arr2);

        System.out.println(arr2.get(arr2.size()-2));

        int highest = -100000;
        int second = -100000;

        for (int i=0; i<=arr2.size()-1;i++){
            if(arr2.get(i)>highest){
                second = highest;
                highest = arr2.get(i);
            }

            if(arr2.get(i)<highest && arr2.get(i)>highest){
                second = arr2.get(i);
            }
        }




    }
}
