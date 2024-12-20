package com.example.models;

import com.example.constants.GenreType;

public class Book {
  private String title;
  private String author;
  private GenreType genre;
  private String ISBN;
  private Integer stock;

  public Book(String title, String author, GenreType genre, String ISBN, Integer stock) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.ISBN = ISBN;
    this.stock = stock;
  }

  public Book() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public GenreType getGenre() {
    return genre;
  }

  public void setGenre(GenreType genre) {
    this.genre = genre;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Book{" +
      "author='" + author + '\'' +
      ", title='" + title + '\'' +
      ", genre=" + genre +
      ", ISBN='" + ISBN + '\'' +
      ", stock=" + stock +
      '}';
  }
}
