import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ATest {
    A obja;

    @Before
    public void setUp() throws Exception {
        obja = new A();
    }


    @Test
    public void methodATest() {
        assertEquals("method of Class A", obja.methodA());
    }

}
