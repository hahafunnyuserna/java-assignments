package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorMeBabyTest {
    @BeforeEach
    void setUp()
    {
        Factortron factor = new Factortron();
    }

    @Test public void emptyForZero()
    {
        
        assertEquals(factor.primeFactors(0), new ArrayList<>(Arrays.asList()));
        assertEquals(factor.primeFactors(1), new ArrayList<>(Arrays.asList()));
        assertEquals(factor.primeFactors(2), new ArrayList<>(Arrays.asList(2)));
        assertEquals(factor.primeFactors(3), new ArrayList<>(Arrays.asList(3)));
        assertEquals(factor.primeFactors(5), new ArrayList<>(Arrays.asList(5)));
        assertEquals(factor.primeFactors(7), new ArrayList<>(Arrays.asList(7)));
        assertEquals(factor.primeFactors(11), new ArrayList<>(Arrays.asList(11)));

        assertEquals(factor.primeFactors(25), new ArrayList<>(Arrays.asList(5, 5)));
    }
}
