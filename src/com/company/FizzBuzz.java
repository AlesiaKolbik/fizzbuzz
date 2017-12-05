package com.company;

public class FizzBuzz {

    public static void main(String[] args) {
        for( int i=1;i<=100;i++){
	    if((i%5)==0){
	        System.out.println("fizz");
	        continue;
        }
        else if((i%7)==0){
	        System.out.println("buzz");
            continue;
        }
        else if((i%5)==0&&(i%7)==0){
	        System.out.println("FizzBuzz");
            continue;
        }
        else {
                System.out.println(i+" ");
            }
    }
    }
}
