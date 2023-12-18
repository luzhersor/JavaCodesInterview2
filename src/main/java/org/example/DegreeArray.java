package org.example;

import java.util.ArrayList;
import java.util.List;

public class DegreeArray {

    public static void main(String[] args) {

        /*DEGREE OF AN ARRAY
         * 1 the degree of the array
         * 2 the lenght of the shortest subarray that shares that degree
         * */

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(2);

        List<Integer> ocurrences = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        int degree = 0;

        for(int i=0; i<=arr.size()-1; i++){
            if(numbers.contains(arr.get(i))){

                ocurrences.set(numbers.indexOf(arr.get(i)),ocurrences.get(numbers.indexOf(arr.get(i)))+1);
                //   (index, int)


            } else {
                numbers.add(arr.get(i));
                ocurrences.add(1);
            }
        }

        for(int i=0;i<=ocurrences.size()-1;i++){
            if(ocurrences.get(i)>degree){
                degree = ocurrences.get(i);
            }
        }

        System.out.println(arr);
        System.out.println(degree+" degree");

        //Tengo que ubicar


    }
}
