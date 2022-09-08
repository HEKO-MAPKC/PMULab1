package com.example.lab1;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 3);
    }
    @Test
    public void addition_isCorrect() throws Exception {
        Mfunc methods = new Mfunc();
        //MainActivity m = new MainActivity();
        assertEquals(methods.min(2,3),2);
        assertEquals(methods.min(-1,1),-1);
        assertEquals(methods.min(6,3),3);
        assertEquals(methods.min(100,0),0);

        assertEquals(methods.max(-1,3),3);
        assertEquals(methods.max(100,3),100);
        assertEquals(methods.max(-5,0),0);
        assertEquals(methods.max(-3,3),3);


    }
}