package org.example;

public class Split3 {

    /*Using Java to reverse the words in the string = "Welcome to this Javascript Guide!" to generate the following output 1 and 2, without using String inbuilt function reverse()
     Output:
     1. "!ediuG tpircsavaJ siht ot emocleW"
     2. "emocleW ot siht tpircsavaJ !ediuG" */
    public static void main(String[] args) {

        String str = "Welcome to this Javascript Guide!";
        String str2 = "";

        for(int i=str.length()-1;i>=0; i--){
            str2 = str2 + str.charAt(i);
        }

        System.out.println(str2);

        String[] words = str.split(" ");
        for(int i=0;i<= words.length-1;i++){
            System.out.println(words[i]);
        }

        String reversePhrase = "";
        for(String w:words){
            String reverseWord = " ";
            for(int i=w.length()-1;i>=0;i--){
                reverseWord = reverseWord + w.charAt(i);
                //System.out.println(w.charAt(i));
            }
            reversePhrase = reversePhrase + reverseWord;
        }

        System.out.println(reversePhrase);



    }

}
