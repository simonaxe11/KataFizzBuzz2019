package com.cifpcarballeira.katas.FizzBuzz;

public class FizzBuzz {

    public String getFizzBuzz(int i) {
        if (i%3==0){
            return "Fizz";
        }
        if (i%5==0) {
            return "Buzz";
        }
        return i+"";  
    }
}
