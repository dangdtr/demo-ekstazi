import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ABCDTest {
    A obja;
    B objb;
    C objc;
    D objd;

    @Before
    public void setUp() throws Exception {
        obja = new A();
        objb = new B();
        objc = new C();
        objd = new D();
    }



    @Test
    public void methodATest() {
        assertEquals("method of Class A", obja.methodA());
    }

    @Test
    public void methodBTest() {
        assertEquals("method of Class B", objb.methodB());
    }
    @Test
    public void methodCTest() {
        assertEquals("method of Class C", objc.methodC());
    }
    @Test
    public void methodDTest() {
        assertEquals("method of Class D", objd.methodD());
    }
}

