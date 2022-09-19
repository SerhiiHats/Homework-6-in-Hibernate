package services.servicesImpl;

import entity.AuthorBookDto;
import repos.reposImpl.AuthorBookRepositoryImpl;
import repos.reposImpl.AuthorRepositoryImpl;
import repos.reposImpl.BookRepositoryImpl;

import java.util.List;

public class AuthorBookService {

    private final AuthorBookRepositoryImpl authorBookRepository;
    private final AuthorRepositoryImpl authorRepository;
    private final BookRepositoryImpl bookRepository;

    public AuthorBookService(AuthorBookRepositoryImpl authorBookRepository, AuthorRepositoryImpl authorRepository, BookRepositoryImpl bookRepository) {
        this.authorBookRepository = authorBookRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public void addAuthorToBook(Long authorId, Long bookId) {
        if (!authorRepository.isAuthorExist(authorId) || !bookRepository.isBookExist(bookId)) {
            throw new RuntimeException("the author or the book doesn't exist!");
        }
        authorBookRepository.addAuthorToBook(authorId, bookId);
    }

    public List<AuthorBookDto> getAuthorBookDtoByAuthorId(Integer id) {
        return authorBookRepository.getAuthorBookDtoByAuthorId(id);
    }

    public List<AuthorBookDto> getAuthorBookDtoByBookId(Integer id) {
        return authorBookRepository.getAuthorBookDtoByBookId(id);
    }
}
