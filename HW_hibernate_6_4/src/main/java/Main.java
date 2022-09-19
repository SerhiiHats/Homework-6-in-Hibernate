import entity.AuthorBookDto;
import entity.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import repos.FactoryRepository;
import repos.reposImpl.AuthorBookRepositoryImpl;
import repos.reposImpl.AuthorRepositoryImpl;
import repos.reposImpl.BookRepositoryImpl;
import repos.reposImpl.FactoryRepositoryImpl;
import services.AuthorService;
import services.BookService;
import services.servicesImpl.AuthorBookService;
import services.servicesImpl.AuthorServiceImpl;
import services.servicesImpl.BookServiceImpl;

import java.util.List;

/**
 * Домашнее задание 6
 * Задание 4
 * Используя MySQL Workbench переписать базу данных так,
 * чтобы одну книгу могли б написать несколько авторов,
 * также один автор может написать несколько книг.
 * Реализовать связь многие ко многим.
 **/

public class Main {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        LOGGER.info("Начало работы метод main");
        FactoryRepository factory = FactoryRepositoryImpl.getInstance();
        AuthorService authorService = new AuthorServiceImpl(factory.getAuthorRepositoryImpl());
        BookService bookService = new BookServiceImpl(factory.getBookRepositoryImpl());
        AuthorBookService authorBookService = new AuthorBookService(new AuthorBookRepositoryImpl(), new AuthorRepositoryImpl(), new BookRepositoryImpl());

        authorService.add15EntityAuthorsByRnd();
        bookService.add20EntityBooksByRnd();

        authorBookService.addAuthorToBook(1L, 2L);
        authorBookService.addAuthorToBook(1L, 5L);
        authorBookService.addAuthorToBook(3L, 2L);
        authorBookService.addAuthorToBook(3L, 7L);
        authorBookService.addAuthorToBook(5L, 3L);
        authorBookService.addAuthorToBook(5L, 4L);
        authorBookService.addAuthorToBook(5L, 7L);



        LOGGER.info("Конец работы метод main");



    }
}
