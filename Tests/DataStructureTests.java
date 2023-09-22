package Tests;

import Main.MyDataStructure;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataStructureTests {
    @Test
    public void test(){
        MyDataStructure ds = new MyDataStructure();
        ds.insert(1);
        ds.insert(2);
        ds.insert(3);
        ds.insert(3);
        assertEquals(ds.getSize(), 3);
        assertEquals(ds.getElemIndex(3), 2);
        assertEquals(ds.getElemIndex(2), 1);
        assertEquals(ds.getElemIndex(1), 0);
        ds.remove(2);
        assertEquals(ds.getSize(), 2);
        assertEquals(ds.getElem(1), 3);
        assertEquals(ds.getElem(0), 1);
        ds.remove(3);
        assertEquals(ds.getSize(), 1);
        ds.remove(1);
        assertEquals(ds.getSize(), 0);
    }
}
