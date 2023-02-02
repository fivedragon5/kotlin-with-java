package com.lannstark.lec04;

import com.lannstark.lec04.JavaMoney;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);
    System.out.println(money1.plus(money2));

    if (money1.compareTo(money2) > 0) {
      System.out.println("Money1 > Money2 !!");
    }
    else {
      System.out.println("Money1 < Money2 !!");
    }

    JavaMoney m1 = new JavaMoney(1_000L);
    JavaMoney m2 = m1;
    JavaMoney m3 = new JavaMoney(1_000L);

    //Java 에서는 == 은 주소 값 비교
    //equals는 값 비교
    System.out.println(m1 == m2);
    System.out.println(m1 == m3);

    System.out.println(money1.equals(m3));
  }

}
