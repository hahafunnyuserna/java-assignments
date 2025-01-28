package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestConverter {

  Converter converter;

  @BeforeEach
  void setUp() {
    converter = new Converter();
  }

  @Test
  public void testZeroOuncesToPounds() {
    assertEquals("You have 0 pounds.", converter.toPounds(0));
  }

  @Test
  public void test1OunceToPounds() {
    assertEquals("You have 0.0625 pounds.", converter.toPounds(1));
  }

  @Test
  public void test2OuncesToPounds() {
    assertEquals("You have 0.125 pounds.", converter.toPounds(2));
  }

  @Test
  public void test16OuncesToPounds() {
    assertEquals("You have 1 pound.", converter.toPounds(16));
  }

  @Test
  public void test24OuncesToPounds() {
    assertEquals("You have 1.5 pounds.", converter.toPounds(24));
  }

  @Test
  public void test32OuncesToPounds() {
    assertEquals("You have 2 pounds.", converter.toPounds(32));
  }

  @Test
  public void testZeroOuncesToPoundsAndOunces() {
    assertEquals("You have 0 ounces.", converter.toPoundsAndOunces(0));
  }

  @Test
  public void test1OunceToPoundsAndOunces() {
    assertEquals("You have 1 ounce.", converter.toPoundsAndOunces(1));
  }

  @Test
  public void test2OuncesToPoundsAndOunces() {
    assertEquals("You have 2 ounces.", converter.toPoundsAndOunces(2));
  }

  @Test
  public void test16OuncesToPoundsAndOunces() {
    assertEquals("You have 1 pound.", converter.toPoundsAndOunces(16));
  }

  @Test
  public void test24OuncesToPoundsAndOunces() {
    assertEquals("You have 1 pound and 8 ounces.", converter.toPoundsAndOunces(24));
  }

  @Test
  public void test32OuncesToPoundsAndOunces() {
    assertEquals("You have 2 pounds.", converter.toPoundsAndOunces(32));
  }
}
