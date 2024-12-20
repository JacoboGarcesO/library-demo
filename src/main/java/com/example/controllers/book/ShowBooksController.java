package com.example.controllers.book;

import com.example.controllers.interfaces.IController;
import com.example.models.Book;
import com.example.services.book.ShowBooks;

import java.util.List;

public class ShowBooksController implements IController {
  private final ShowBooks command;

  public ShowBooksController(ShowBooks command) {
    this.command = command;
  }

  @Override
  public void execute() {
    List<Book> books = command.execute();
    books.forEach((book) -> System.out.println(book.toString()));
  }
}
