package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger2 {

      /*
    Given an array of integers, where all elements but one occur twice, find the unique element.
    Example

    The unique element is .
     */

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        System.out.println(arr);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> ocurrences = new ArrayList<>();

        Collections.sort(arr);
        System.out.println(arr);

        for(int i=0; i<=arr.size()-1;i++){
            if(numbers.contains(arr.get(i))){
                System.out.println("Si");
                ocurrences.set(numbers.indexOf(arr.get(i)),ocurrences.get(numbers.indexOf(arr.get(i)))+1);

            } else {
                numbers.add(arr.get(i));
                ocurrences.add(1);
            }
        }
    }
}
