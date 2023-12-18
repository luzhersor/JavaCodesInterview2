package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSum2 {

    public static void main(String[] args) {

        /* Determine the starting index at which
    a sequence of consecutive numbers exists
    whose sum is equal to the target value given
     */
        List<Integer> list = new ArrayList<>();
        int sumValue = 7;
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(6);

        int total = 0;
        int index = 0;

        for (int i = 0; i <= list.size() - 1; i++){

            for (int j = i; j <= list.size() - 1; j++){
                total = total + list.get(j);
                index++;

                if(total == sumValue){
                    System.out.println("the starting index at which the sum is equal to "+total +" is: "+index );
                }
            }

            total = 0;
            index = 0;
        }

    }
}
