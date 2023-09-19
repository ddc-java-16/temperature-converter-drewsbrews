package edu.cnm.deepdive.temperature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CelsiusToFahrenheightConverterTest {

  @ParameterizedTest
  @CsvFileSource(resources = "c-to-f.csv", useHeadersInDisplayName = true)
  void convert(double celsius, double expectedFahrenheight) {
    assertEquals(expectedFahrenheight, new CelsiusToFahrenheightConverter().convert(celsius),
        0.00001);

  }
}