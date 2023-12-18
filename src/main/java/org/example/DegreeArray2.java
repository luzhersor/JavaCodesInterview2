package org.example;

import java.util.ArrayList;
import java.util.List;

public class DegreeArray2 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);


        List<Integer> ocurrences = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<=arr.size()-1; i++){
            if(numbers.contains(arr.get(i))){
                ocurrences.set(numbers.indexOf(arr.get(i)),ocurrences.get(numbers.indexOf(arr.get(i)))+1);
            } else {
              numbers.add(arr.get(i));
              ocurrences.add(1);
            }
        }

        int degree = 0;

        for(int i=0;i<=ocurrences.size()-1;i++){
            if(ocurrences.get(i)>degree){
                degree = ocurrences.get(i);
            }
        }

    }
}
