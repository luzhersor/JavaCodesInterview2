package org.example;

import java.util.ArrayList;
import java.util.List;

public class RobusLanguage {

    // Given a sample string "Java is a very robust
    // language", write a Java 8 program to find all
    // the non-repeated characters in it?

    //Ten cuidado con StringValueOf, A veces es lo que necesitas cambiar para que compile
    //Lo tienes que convertir porque son chars, no string. !!!

    public static void main(String[] args) {

        String str= "Java is a very robust language";

        char[] frase = str.toCharArray();
        List<Integer> ocurrences = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        System.out.println(frase[3]);

        for(int i=0; i<=str.length()-1;i++){
            if(letters.contains(String.valueOf(str.charAt(i)))){
                //It contains, we should replace it for the new one ocurrence
                ocurrences.set(letters.indexOf(String.valueOf(frase[i])),ocurrences.get(letters.indexOf(String.valueOf(str.charAt(i))))+1);
                //(Index, value)

            } else {
                letters.add(String.valueOf(str.charAt(i)));
                ocurrences.add(1);
            }
        }

        System.out.println(ocurrences);
        System.out.println(letters);

        for(int i=0; i<=ocurrences.size()-1;i++){
            if(ocurrences.get(i)==1){
                System.out.println(letters.get(i)+"\n");
            }
        }


    }
}
