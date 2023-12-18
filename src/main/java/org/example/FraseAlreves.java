package org.example;

import java.util.Scanner;

public class FraseAlreves {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        str = sc.nextLine();

        String[] cadena = str.split(" ");
        for(String i:cadena){
            System.out.println(i);
        }

        for(int i=cadena.length-1;i>=0;i--){
            System.out.println(cadena[i]);
        }


    }


}
