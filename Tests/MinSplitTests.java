package Tests;

import org.junit.Test;

import static Main.Main.minSplit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MinSplitTests {
    @Test
    public void test1() throws Exception {
        int amount = 56;
        assertEquals(3, minSplit(amount));
    }

    @Test
    public void test2() throws Exception {
        int amount = 4;
        assertEquals(4, minSplit(amount));
    }

    @Test
    public void test3() throws Exception {
        int amount = 0;
        assertEquals(0, minSplit(amount));
    }

    @Test
    public void test4(){
        int amount = -5;
        assertThrows(Exception.class, () -> minSplit(amount));
    }

    @Test
    public void test5() throws Exception {
        int amount = 115;
        assertEquals(4, minSplit(amount));
    }
}
