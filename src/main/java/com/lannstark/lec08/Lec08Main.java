package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public String getGradeSwitch(int score) {
    switch (score / 10) {
      case 9: return "A";
      case 8: return "B";
      case 7: return "C";
      default: return "D";
    }
  }
}
