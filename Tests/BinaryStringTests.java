package Tests;

import org.junit.Test;

import static Main.Main.binaryString;
import static org.junit.Assert.assertEquals;

public class BinaryStringTests {
    @Test
    public void test1(){
        String a = "1";
        String b = "0";
        assertEquals("1", binaryString(a, b));
    }

    @Test
    public void test2(){
        String a = "1";
        String b = "1";
        assertEquals("10", binaryString(a, b));
    }

    @Test
    public void test3(){
        String a = "101101";
        String b = "000001";
        assertEquals("101110", binaryString(a, b));
    }

    @Test
    public void test4(){
        String a = "101101";
        String b = "1";
        assertEquals("101110", binaryString(a, b));
    }

    @Test
    public void test5(){
        String a = "111111";
        String b = "1111";
        assertEquals("1001110", binaryString(a, b));
    }
}
