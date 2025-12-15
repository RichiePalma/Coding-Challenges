import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleArraySumTest {
    
    @Test
    public void testExample1() {
        int[] ar = {1, 2, 3, 4, 10, 11};
        int expected = 31;
        assertEquals(expected, SimpleArraySum.simpleArraySum(ar));
    }
    
    @Test
    public void testSingleElement() {
        int[] ar = {5};
        int expected = 5;
        assertEquals(expected, SimpleArraySum.simpleArraySum(ar));
    }
    
    @Test
    public void testEmptyArray() {
        int[] ar = {};
        int expected = 0;
        assertEquals(expected, SimpleArraySum.simpleArraySum(ar));
    }
    
    @Test
    public void testNegativeNumbers() {
        int[] ar = {-1, -2, -3};
        int expected = -6;
        assertEquals(expected, SimpleArraySum.simpleArraySum(ar));
    }
}
