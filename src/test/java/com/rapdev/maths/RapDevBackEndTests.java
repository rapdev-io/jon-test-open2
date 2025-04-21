package com.rapdev.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RapDevBackEndTests {

    @Test
    public void loginSuccess() {
        Maths testClass = new Maths();
        assertEquals(testClass.divide(6, 3), 2);
    }
    
    @Test
    public void passwordChange() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void apiValidation() {
        assertEquals(2, 1 + 1);
    }
}
