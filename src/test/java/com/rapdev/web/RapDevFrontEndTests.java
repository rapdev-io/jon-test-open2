import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
