package com.cresuta;

public class FizzBuzz {

    public static void main(String[] args) {
	// If number is a multiple of 3, print "Fizz"
    // If number is a multiple of 5, print "Buzz"
    // If number is a multiple of both 3 & 5, print "FizzBuzz"
    // For all other numbers, print just the number
        fizzBuzz(50);
    }

    public static void fizzBuzz(int rangeOfNumbers){
        for(int i = 1; i <= rangeOfNumbers; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
