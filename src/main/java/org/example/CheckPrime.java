package org.example;

public class CheckPrime {
    public static void main(String[] args) {
        int number = 6;
        int count = 0;

        for(int i=1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }

        System.out.println(count);

        if(count==2){
            System.out.println("It's prime");
        } else {
            System.out.println("Not");
        }
    }
}
