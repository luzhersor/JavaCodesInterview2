package org.example;

public class DuplicateElement {
    public static void main(String[] args) {

        /*String arr[] = {"jav", "C", "C++", "Python", "java", "jav"};
        boolean flag = false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++) {
                if(arr[i]==arr[j]){
                    flag = true;
                    System.out.println(arr[i]);
                }
            }
        }*/

        String arr[] = {"jav", "C", "C++", "Python", "java", "jav"};
        boolean flag = false;

        for(int i=0;i<=arr.length-1;i++){

            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    System.out.println(arr[i]);
                }
            }
        }


    }


}
