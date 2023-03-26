package com.javacode_4thMar_2023;

public class MixAll {

	public static void main(String[] args) {
      int i = 1;
      System.out.println(i); //1
      int j = --i;
      System.out.println(i); //0
      System.out.println(j); //0
      
      System.out.println("------------------------------");
      int k = i++ - --i + i++;
      //  k = 0   - 0  + 0 = 0
      //  i = 1,    0,   1
      System.out.println(i); //1
      System.out.println(k); //0
      System.out.println(j); //0
      
      System.out.println("------------------------------");
      
      int l = j++ + ++k + --i - i--;
      // l = 0    +  1  +  0  - 0 = 1
      // j = 1,                   = 1
      //k  =         1,           = 1
      //i =               0, -1   = -1
      
      System.out.println(i); //-1
      System.out.println(j); //1
      System.out.println(k); //1
      System.out.println(l); //1

	}

}
