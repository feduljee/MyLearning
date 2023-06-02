package com.farokh.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
  public List<Integer> factorize(Integer input) {
    List<Integer> factorList = new ArrayList<>();
    for (int divisor = 2; input >= divisor; ++divisor) {
      while (input % divisor == 0) {
        factorList.add(divisor);
        input /= divisor;
      }
    }
    if (input >= 2) {
      factorList.add(input);
    }
    return factorList;
  }
}
