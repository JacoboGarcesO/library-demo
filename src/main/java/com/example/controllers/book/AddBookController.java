package com.example.controllers.book;

import com.example.controllers.interfaces.IController;
import com.example.models.Book;
import com.example.services.book.AddBook;

public class AddBookController implements IController {
  private final AddBook command;

  public AddBookController(AddBook command) {
    this.command = command;
  }

  @Override
  public void execute() {
    Book book = command.execute();
    System.out.println("Se agrego el libro:");
    System.out.println(book.toString());
  }
}
