package Tests;

import junit.framework.TestCase;
import org.junit.Test;

import static Main.Main.notContains;


public class NotContainsTests extends TestCase {
    @Test
    public void test1() throws Exception {
        int[] numsOne = new int[]{1,2,3,4,5};
        assertEquals(6, notContains(numsOne));
    }

    @Test
    public void test2() throws Exception {
        int[] numsTwo = new int[]{-1, -2, -3};
        assertEquals(1, notContains(numsTwo));
    }

    @Test
    public void test3() throws Exception {
        int[] numsThree = new int[]{-1};
        assertEquals(1, notContains(numsThree));
    }

    @Test
    public void test4() throws Exception {
        int[] numsFour = new int[]{11, -1, -5, -6};
        assertEquals(1, notContains(numsFour));
    }

    @Test
    public void test5() throws Exception {
        int[] numsFive = new int[]{};
        assertEquals(1, notContains(numsFive));
    }

}
