package org.example;

public class CountNumberDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int cont = 0;

        String str = String.valueOf(num);
        System.out.println(str);

        for(int i=0; i<=str.length()-1;i++){
            cont++;
        }

        System.out.println(cont+" Number of digits");
    }
}
