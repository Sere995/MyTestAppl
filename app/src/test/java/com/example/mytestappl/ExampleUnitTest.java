package com.example.mytestappl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isNotCorrect(){
        assertEquals(4, 1+3);
    }

   /* @Test
    public void product_isNotCorrect() { assertEquals(10, 5*1); }*/

    @Test
    public void product_isCorrect() {
        assertEquals(10, 5*2);
    }
}
