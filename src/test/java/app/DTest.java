package app;
import org.junit.Before;
import org.junit.Test;

import com.uet.app.D;

import static junit.framework.TestCase.assertEquals;

public class DTest {
    D objd;

    @Before
    public void setUp() throws Exception {
        objd = new D();
    }


    @Test
    public void methodDTest() {
        assertEquals("method of Class D", objd.methodD());
    }

}
