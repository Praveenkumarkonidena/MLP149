package com.hexa.app;
import com.hexa.app.model.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MyCalcTest {
    MyCalc c = new MyCalc();
    @Test
    public void testAdd() {
        assertEquals(30, c.add(10, 20));
        assertNotEquals(-10, c.add(10, 20));
        assertNotEquals(200, c.add(10, 20));
        assertNotEquals(0, c.add(10, 20));
        assertNotEquals(0, c.add(10, 20));
    }
    
}