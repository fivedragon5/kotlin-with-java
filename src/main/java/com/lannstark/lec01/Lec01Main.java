package com.lannstark.lec01;

import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1)
    number1 = 5L;
    final long number2 = 10L; // (2)
//    number2 = 10L; // 불가능

    //long a = null;
    Long b = null;



    Long number3 = 1_000L; // (3)
    Person person = new Person("최태현"); // (4)

    List<Integer> numbers = Arrays.asList(1, 2);

    long num1 = 10L;
    Long num2 = 20L;

    Person person5 = new Person("fad");
  }

}
