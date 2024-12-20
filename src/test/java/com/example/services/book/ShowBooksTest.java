package com.example.services.book;

import com.example.constants.GenreType;
import com.example.models.Book;
import com.example.repositories.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class ShowBooksTest {

  @Test
  void execute() {
    BookRepository bookRepository = Mockito.mock(BookRepository.class);
    Mockito.when(bookRepository.getBooks()).thenReturn(Arrays.asList(new Book("Titulo 1", "Autor 1", GenreType.HORROR, "93y74782384", 10)));
    ShowBooks showBooks = new ShowBooks(bookRepository);
    List<Book> books = showBooks.execute();

    Assertions.assertEquals(1, books.size());
    Assertions.assertEquals("Titulo 1", books.get(0).getTitle());
    Assertions.assertEquals("Autor 1", books.get(0).getAuthor());
    Assertions.assertEquals(10, books.get(0).getStock());
    Assertions.assertEquals(GenreType.HORROR, books.get(0).getGenre());

    Mockito.verify(bookRepository).getBooks();
  }
}