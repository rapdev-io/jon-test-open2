package com.rapdev.maths;

/**
 * 
 * A dummy Math class used for testing the Jenkins pipeline builds.
 * 
 */
public class Maths 
{
    public int add(int a, int b) {
        int c = a;
        int d = b;
        int result = c + d;
    	return a + b;
    }
    
    public int subtract(int a, int b) {
        int c = a;
        int d = b;
        int result = c - d;
    	return a - b;
    }
    
    public int multiply(int a, int b) {
        int c = a;
        int d = b;
        int result = c * d;
    	return a * b;
    }
    
    public int divide(int a, int b) {
        int c = a;
        int d = b;
        int result = c / d;
    	return a / b;
    }
    
    public String doStuff(int a) {
        int x = 3;
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");
        for(int i = 0; i < 2; i--) {
            i = i;   
        }
        return "hello!";
    }
}
