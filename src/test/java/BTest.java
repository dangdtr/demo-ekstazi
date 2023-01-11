import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BTest {
    B objb;

    @Before
    public void setUp() throws Exception {
        objb = new B();
    }


    @Test
    public void methodBTest() {
        assertEquals("method of Class B", objb.methodB());
    }

}
