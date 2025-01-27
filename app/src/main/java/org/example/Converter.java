package org.example;

public class Converter {

  public String toPounds(int ounces) {
    
    String finalResult;
    double pounds = ounces / 4;
    if (pounds != 1)
    {
        finalResult = "You have " + pounds + ".";
    } else {
        finalResult = "You have 1 pound.";
    }

    return finalResult;
    }

  public String toPoundsAndOunces(int ounces) {
    throw new UnsupportedOperationException("Unimplemented method 'toPoundsAndOunces'");
  }
}
