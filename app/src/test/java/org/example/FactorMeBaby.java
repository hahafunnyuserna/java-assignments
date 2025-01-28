package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorMeBabyTest {
    @Test void emptyForZero()
    {
        Factortron factor = new Factortron();
        assertEquals(factor.primeFactors(0), new ArrayList<>());
    }
}
