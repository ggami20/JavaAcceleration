package Tests;

import org.junit.Test;

import static Main.Main.countVariants;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CountVariantsTests {
    @Test
    public void test1() throws Exception {
        int floors = 3;
        int stairsCount = 3;
        assertEquals(27, countVariants(stairsCount, floors));
    }

    @Test
    public void test2() {
        int floors = 5;
        int stairsCount = 0;
        assertThrows(Exception.class, () -> countVariants(stairsCount, floors));
    }

    @Test
    public void test3(){
        int floors = 0;
        int stairsCount = 6;
        assertThrows(Exception.class, () -> countVariants(stairsCount, floors));
    }
    @Test
    public void test4(){
        int floors = -1;
        int stairsCount = -1;
        assertThrows(Exception.class, () -> countVariants(stairsCount, floors));
    }
}
