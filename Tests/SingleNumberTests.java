package Tests;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Main.Main.singleNumber;

public class SingleNumberTests extends TestCase {
    @Test
    public void test1() throws Exception{
        int[] nums = new int[]{1, 1, 2, 2, 3};
        assertEquals(3, singleNumber(nums));
    }

    @Test
    public void test2(){
        int[] nums = new int[]{1, 2, 3};
        Assertions.assertThrows(Exception.class, () -> singleNumber(nums));
    }

    public void test3(){
        int[] nums = new int[]{};
        Assertions.assertThrows(Exception.class, () -> singleNumber(nums));
    }

    public void test4(){
        int[] nums = new int[]{1, 1, 2, 2, 3, 3};
        Assertions.assertThrows(Exception.class, () -> singleNumber(nums));
    }

}
