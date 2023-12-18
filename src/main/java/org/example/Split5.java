package org.example;

public class Split5 {

         /*Using Java to reverse the words in the string = "Welcome to this Javascript Guide!" to generate the following output 1 and 2, without using String inbuilt function reverse()
        Output:
        1. "!ediuG tpircsavaJ siht ot emocleW"
        2. "emocleW ot siht tpircsavaJ !ediuG" */

    public static void main(String[] args) {
        String str = "Welcome to this Javascript Guide!";  //Original String

        String[] words = str.split(" ");
        int[] arr = {1,2,4};
        String reverseString = "";

        for(String w:words){
            String reverseWord = "";

            for(int i=w.length()-1;i>=0;i--){
                reverseWord = reverseWord + w.charAt(i);
            }

            reverseString = reverseString + " " + reverseWord;

        }

        System.out.println(reverseString);

    }

}
