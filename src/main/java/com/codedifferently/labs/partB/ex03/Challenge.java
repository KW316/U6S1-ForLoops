package com.codedifferently.labs.partB.ex03;

public class Challenge {
    public static String challenge(){
        String response = "";
        String[] str = {"Kaleb", "Tariq", "Gio", "Sam", "Steph", "Micheal"};
        /**
         * Your code goes here
         */
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
        return response;
    }

    public static void main(String[] args) {

        String outputFromChallenge = challenge();
        System.out.println(outputFromChallenge);
    }
}
