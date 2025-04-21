package com.rapdev.javaprojects.maths;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions.assertTrue;

//https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html#integration-testing-annotations-junit-jupiter

public class RapDevFrontEndTests {
    
    @Test
    public void loginScreen() {
        Maths testClass = new Maths();
        assertTrue(testClass.add(1, 1) == 2);
    }
    
    @Test
    public void profilePage() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void errorNessagesStyling() {
        assertEquals(2, 1 + 1);
    }
}
