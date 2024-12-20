package com.example.utils;

import java.util.Scanner;

public class ConsoleUtils {
  private final Scanner scanner = new Scanner(System.in);

  public String getString(String message) {
    System.out.println(message);
    return scanner.next();
  }

  public Integer getInteger(String message) {
    try {
      System.out.println(message);
      int value = scanner.nextInt();

      if (value < 0) {
        System.out.println("Ingresa un número positivo.");
        return getInteger(message);
      }

      return value;
    } catch (Exception e) {
      System.out.println("Ingresa un número con formato valido.");
      return getInteger(message);
    }
  }
}
