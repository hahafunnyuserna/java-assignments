package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorMeBabyTest {
    Factortron factor;

    @BeforeEach
    void setUp()
    {
        factor = new Factortron();
    }

    @Test public void factorsOf0()
    {
        assertEquals(factor.primeFactors(0), new ArrayList<>(Arrays.asList()));
    }

    @Test public void factorsOf1()
    {
        assertEquals(factor.primeFactors(1), new ArrayList<>(Arrays.asList()));
    }

    @Test public void factorsOf2()
    {
        assertEquals(factor.primeFactors(2), new ArrayList<>(Arrays.asList(2)));
    }

    @Test public void factorsOf3()
    {
        assertEquals(factor.primeFactors(3), new ArrayList<>(Arrays.asList(3)));
    }

    @Test public void factorsOf5()
    {
        assertEquals(factor.primeFactors(5), new ArrayList<>(Arrays.asList(5)));
    }

    @Test public void factorsOf7()
    {
        assertEquals(factor.primeFactors(7), new ArrayList<>(Arrays.asList(7)));
    }

    @Test public void factorsOf11()
    {
        assertEquals(factor.primeFactors(11), new ArrayList<>(Arrays.asList(11)));
    }

    @Test public void factorsOf1240()
    {
        assertEquals(factor.primeFactors(1240), new ArrayList<>(Arrays.asList(2, 2, 2, 5, 31)));
    }
 
    @Test public void factorsOf3982()
    {
        assertEquals(factor.primeFactors(3982), new ArrayList<>(Arrays.asList(2, 11, 181)));
    }

    @Test public void factorsOf798()
    {
        assertEquals(factor.primeFactors(798), new ArrayList<>(Arrays.asList(2, 3, 7, 19)));
    }

    @Test public void factorsOf8394()
    {
        assertEquals(factor.primeFactors(8394), new ArrayList<>(Arrays.asList(2, 3, 1399)));
    }

    @Test public void factorsOf2175()
    {
        assertEquals(factor.primeFactors(2175), new ArrayList<>(Arrays.asList(3, 5, 5, 29)));
    }

    

}
