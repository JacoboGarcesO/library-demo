package com.example.constants;

public enum GenreType {
  HORROR("Terror"),
  COMEDY("Comedia"),
  FANTASY("Fantasía"),
  FICTION("Ficción"),
  THRILLER("Suspenso"),
  ROMANCE("Romance"),
  SCIENCE_FICTION("Ciencia ficción"),
  ANIME("Anime"),
  DRAMA("Drama");

  private final String name;

  GenreType(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
