
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculationTest {

    @Test
    public void testMax2Int1() {
        assertEquals(5, Calculation.max2Int(3, 5));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(3, Calculation.max2Int(3, 1));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(0, Calculation.max2Int(0, -1));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(-4, Calculation.max2Int(-7, -4));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(9999, Calculation.max2Int(9999, -9339));
    }

    @Test
    public void testMinArray1() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, Calculation.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, Calculation.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = {-99, 0, -10101, 2, 3, 4, 7};
        assertEquals(-10101, Calculation.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = {3, 3, 3, 3, 3};
        assertEquals(3, Calculation.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = {-10000, 10000, 0};
        assertEquals(-10000, Calculation.minArray(arr));
    }

}