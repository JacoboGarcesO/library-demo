package com.example.services.book;

import com.example.constants.GenreType;
import com.example.models.Book;
import com.example.repositories.BookRepository;
import com.example.services.interfaces.ICommand;
import com.example.utils.ConsoleUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddBook implements ICommand<Book> {
  private final BookRepository repository;
  private final ConsoleUtils console;
  private final List<String> genres = List.of(GenreType.values()).stream().map((genre) -> genre.getName()).toList();

  public AddBook(BookRepository repository, ConsoleUtils console) {
    this.repository = repository;
    this.console = console;
  }

  @Override
  public Book execute() {
    String title = console.getString("Ingrese el titulo del libro");
    String author = console.getString("Ingrese el autor del libro");
    String ISBN = console.getString("Ingrese el ISBN del libro");
    int stock = console.getInteger("Ingrese la cantidad de copias del libro");
    GenreType genre = getGenre(console.getInteger("Escoja el género del libro: \n" + getGenres()));
    Book book = new Book(title, author, genre, ISBN, stock);
    repository.addBook(book);
    return book;
  }

  private String getGenres() {
    return this.genres.stream().map((genre) -> (genres.lastIndexOf(genre) + 1) + ". " + genre).collect(Collectors.joining("\n"));
  }

  private GenreType getGenre(Integer option) {
    Map<Integer, GenreType> genreTypeMap = new HashMap<>();
    genreTypeMap.put(1, GenreType.HORROR);
    genreTypeMap.put(2, GenreType.COMEDY);
    genreTypeMap.put(3, GenreType.FANTASY);
    genreTypeMap.put(4, GenreType.FICTION);
    genreTypeMap.put(5, GenreType.THRILLER);
    genreTypeMap.put(6, GenreType.ROMANCE);
    genreTypeMap.put(7, GenreType.SCIENCE_FICTION);
    genreTypeMap.put(8, GenreType.ANIME);
    genreTypeMap.put(9, GenreType.DRAMA);
    return genreTypeMap.get(option);
  }
}
