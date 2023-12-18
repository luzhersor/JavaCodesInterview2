package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveSum {
    /* Determine the starting index at which
    a sequence of consecutive numbers exists
    whose sum is equal to the target value given
     */
    public static void main(String[] args) {
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

        int sum = 0;
        int startIndex = 0;
        int lastIndex = 0;

        for(int i=0;i<=list.size()-1;i++){

            for(int j=i;j<=list.size()-1;j++){
                sum =  sum + list.get(j);
                startIndex = i;
                lastIndex = j;
                System.out.println(sum);
                if(sum == sumValue){
                    System.out.println("Encontrado");
                    System.out.println("Empieza en el índice "+startIndex);
                    System.out.println("Termina en el indice "+lastIndex);
                }
            }

            sum = 0;
        }
    }
}
