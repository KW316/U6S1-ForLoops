package com.codedifferently.labs.partB.ex01;

public class CountByTens {
    public static String countingByTens() {
        String response = "";

        /**
         * Your code goes here
         */
        for(int i = 10; i <= 100; i++){
            if(i % 10 == 0){
                System.out.println(i);
            }
        }
        return response;
    }

    public static void main(String[] args) {
        String counting = countingByTens();
        System.out.print(counting);
    }
}
