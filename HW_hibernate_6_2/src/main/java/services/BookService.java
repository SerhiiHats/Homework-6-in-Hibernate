package services;

import entity.Book;

import java.util.List;

public interface BookService {
    Book add(Book book);

    List<Book> getAll();

    void add20EntityBooksByRnd();

    Book getById(long id);

    Book updateNameById(long id, String newName);

    Book remove(Book book);

    Book removeById(long id);

}

