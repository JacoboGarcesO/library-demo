package com.example.models;

public class User {
  private String DNI;
  private String name;
  private String email;

  public User(String DNI, String name, String email) {
    this.DNI = DNI;
    this.name = name;
    this.email = email;
  }

  public User() {
  }

  public String getDNI() {
    return DNI;
  }

  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
