package com.example.services.book;

import com.example.constants.GenreType;
import com.example.models.Book;
import com.example.repositories.BookRepository;
import com.example.utils.ConsoleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AddBookTest {

  @Test
  void execute() {
    ConsoleUtils consoleUtils = Mockito.mock(ConsoleUtils.class);
    Mockito.when(consoleUtils.getString(Mockito.anyString()))
      .thenReturn("Titulo 1")
      .thenReturn("Autor 1")
      .thenReturn("93y74782384");

    Mockito.when(consoleUtils.getInteger(Mockito.anyString())).thenReturn(10).thenReturn(1);

    BookRepository bookRepository = BookRepository.getInstance();
    AddBook addBook = new AddBook(bookRepository, consoleUtils);
    Book book = addBook.execute();
    Assertions.assertEquals("Titulo 1", book.getTitle());
    Assertions.assertEquals("Autor 1", book.getAuthor());
    Assertions.assertEquals(10, book.getStock());
    Assertions.assertEquals(GenreType.HORROR, book.getGenre());

    Mockito.verify(consoleUtils, Mockito.times(3)).getString(Mockito.anyString());
    Mockito.verify(consoleUtils, Mockito.times(2)).getInteger(Mockito.anyString());
  }
}