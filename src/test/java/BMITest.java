import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BMITest {

    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", BMI.calculateBMI(55, 1.725));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", BMI.calculateBMI(60, 1.66));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thừa cân", BMI.calculateBMI(75, 1.75));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Béo phì", BMI.calculateBMI(80, 1.66));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", BMI.calculateBMI(70, 1.8));
    }
}
