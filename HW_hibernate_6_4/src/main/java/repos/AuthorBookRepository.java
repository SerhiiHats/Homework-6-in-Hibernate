package repos;

import entity.AuthorBookDto;

import java.util.List;

public interface AuthorBookRepository {
    @SuppressWarnings("unchecked")
    void addAuthorToBook(Long authorId, Long bookId);

    List<AuthorBookDto> getAuthorBookDtoByAuthorId(Integer id);

    List<AuthorBookDto> getAuthorBookDtoByBookId(Integer id);
}
