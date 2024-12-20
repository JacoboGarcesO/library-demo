package com.example.repositories;

import com.example.models.Book;

import java.util.LinkedList;
import java.util.List;

public class BookRepository {
  private static BookRepository instance;
  private List<Book> books;

  private BookRepository() {
    books = new LinkedList<>();
  }

  public static BookRepository getInstance() {
    if (instance == null) {
        instance = new BookRepository();
    }

    return instance;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void addBook(Book book) {
    books.add(book);
  }
}
