package com.example.repositories;

import com.example.models.User;

import java.util.LinkedList;
import java.util.List;

public class UserRepository {
  private static UserRepository instance;
  private List<User> users;

  private UserRepository() {
    users = new LinkedList<>();
  }

  public static UserRepository getInstance() {
    if (instance == null) {
      instance = new UserRepository();
    }

    return instance;
  }

  public List<User> getUsers() {
    return users;
  }

  public void addUser(User user) {
    users.add(user);
  }
}
