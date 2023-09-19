package edu.cnm.deepdive.temperature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CelsiusToFahrenheightConverterTest {

  @Test
  void convert() {
    assertEquals(32, new CelsiusToFahrenheightConverter().convert( 0),
        0.00001);
    assertEquals(212, new CelsiusToFahrenheightConverter().convert( 100),
        0.00001);
    assertEquals(-40, new CelsiusToFahrenheightConverter().convert( -40),
        0.00001);




  }
}