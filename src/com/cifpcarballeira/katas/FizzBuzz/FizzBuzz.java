package com.cifpcarballeira.katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int i) {
        String num = i+"";
        if (i%5==0 && i%3==0) {
            return "FizzBuzz";
        }
        if (i%5 ==0 || num.contains("5")) {
            return "Buzz";
        }
        if (i%3==0){
            return "Fizz";
        }
        if (i%5==0) {
            return "Buzz";
        }
        return i+"";  
    }
}
