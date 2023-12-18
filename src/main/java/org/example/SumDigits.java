package org.example;

import com.sun.security.jgss.GSSUtil;

public class SumDigits {

    public static void main(String[] args) {
        int num = 1234;

        int sum = 0;
        int rem = 0;

        while(num>0){
            rem = num%10;
            System.out.println(rem);

            sum = sum + rem;

            num = num/10;
        }

        System.out.println(sum);
    }


}
