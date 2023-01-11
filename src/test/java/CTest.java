import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CTest {
    C objc;

    @Before
    public void setUp() throws Exception {
        objc = new C();
    }


    @Test
    public void methodCTest() {
        assertEquals("method of Class C", objc.methodC());
    }

}
