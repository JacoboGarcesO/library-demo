package com.example.services.book;

import com.example.models.Book;
import com.example.repositories.BookRepository;
import com.example.services.interfaces.ICommand;

import java.util.List;

public class ShowBooks implements ICommand<List<Book>> {
  private final BookRepository repository;

  public ShowBooks(BookRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Book> execute() {
    return repository.getBooks();
  }
}
