package org.example;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = sc.next();

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Are Palindromes "+str);
            System.out.println(reverse);
        }
    }
}
