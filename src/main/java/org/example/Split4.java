package org.example;

public class Split4 {
    public static void main(String[] args) {
         /*Using Java to reverse the words in the string = "Welcome to this Javascript Guide!" to generate the following output 1 and 2, without using String inbuilt function reverse()
        Output:
        1. "!ediuG tpircsavaJ siht ot emocleW"
        2. "emocleW ot siht tpircsavaJ !ediuG" */

        String str = "Welcome to this Javascript Guide!";  //Original String

        String reverseString = "";

        //1. "!ediuG tpircsavaJ siht ot emocleW"
        for(int i=str.length()-1; i>=0; i--){
            reverseString = reverseString + str.charAt(i);
        }

        System.out.println(reverseString);

        //2  "emocleW ot siht tpircsavaJ !ediuG" */
        String [] words = str.split(" ");

        for(int i=0; i<=words.length-1; i++){
            System.out.println(words[i]);
        }

        String reverseString2 = "";

        for(String w:words){
            String reverseWord = "";
            for(int i=w.length()-1;i>=0;i--){
                reverseWord = reverseWord + w.charAt(i);
            }
            reverseString2 = reverseString2 + " " + reverseWord;

        }

        System.out.println(reverseString2);
    }
}
