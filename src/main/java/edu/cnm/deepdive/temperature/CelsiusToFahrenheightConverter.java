package edu.cnm.deepdive.temperature;

public class CelsiusToFahrenheightConverter {

  private static final double SCALING_FACTOR = 1.8;

  public double convert (double celsius) {
    return SCALING_FACTOR * celsius + 32;
  }

}
