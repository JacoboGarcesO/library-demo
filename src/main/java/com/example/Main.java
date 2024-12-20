package com.example;

import com.example.controllers.book.AddBookController;
import com.example.controllers.book.ShowBooksController;
import com.example.controllers.interfaces.IController;
import com.example.repositories.BookRepository;
import com.example.services.book.AddBook;
import com.example.services.book.ShowBooks;
import com.example.utils.ConsoleUtils;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    ConsoleUtils consoleUtils = new ConsoleUtils();
    BookRepository bookRepository = BookRepository.getInstance();

    AddBook addBookCommand = new AddBook(bookRepository, consoleUtils);
    ShowBooks showBooksCommand = new ShowBooks(bookRepository);

    Map<Integer, IController> controllers = Map.of(
      1, new AddBookController(addBookCommand),
      2, new ShowBooksController(showBooksCommand)
    );

    int option = consoleUtils.getInteger("Bievenido a la biblioteca\n¿Qué deseas hacer?\n1. Añadir libro\n2. Ver libros3. Salir");

    do {
      controllers.get(option).execute();
      option = consoleUtils.getInteger("Bievenido a la biblioteca\n¿Qué deseas hacer?\n1. Añadir libro\n2. Ver libros\n3. Salir");
    } while (option != 3);
  }
}
