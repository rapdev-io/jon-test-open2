package com.rapdev.javaprojects.maths;

/**
 * 
 * A dummy Math class used for testing the Jenkins pipeline builds.
 * 
 */
public class Maths 
{
    public int add(int a, int b) {
    	return a + b;
    }
    
    public int subtract(int a, int b) {
    	return a - b;
    }
    
    public int multiply(int a, int b) {
    	return a * b;
    }
    
    public int divide(int a, int b) {
    	return a / b;
    }
    
    public String doStuff(int a) {
        String c = 1 + Integer.toString(a);
        int d = Integer.parseInt(c) + 5;
        int s = 3 + d;

        int x = 3;
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");
        for(int i = 0; i < 2; i--) {
            i = i;   
        }
        return "hello!";
    }
}
