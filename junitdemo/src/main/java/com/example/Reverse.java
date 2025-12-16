package com.example;

public class Reverse {
    public String reverseString(String inputStr){
        String[] inputStrSplit = inputStr.split("");
        String[] resultString = new String[inputStr.length()];
        int index = 0;
        for(int i=inputStrSplit.length-1;i>=0;i--){
            // System.out.println(i);
            resultString[index] = inputStrSplit[i];
            index++;
            
        }
        String res1 = "";
        for(String letter: resultString){
            // System.out.println(letter);
            res1 = res1+letter;
        }
        // System.out.println(res1);
        return res1;
    }

    public static void main(String[] args) {
        Reverse revObj = new Reverse();
        String res = revObj.reverseString("test");
        System.out.println(res);
    }
}
