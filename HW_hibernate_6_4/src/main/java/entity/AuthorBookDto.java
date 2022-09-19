package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Books_Authors")
public class AuthorBookDto implements Serializable {
    @Id
    @Column(name = "author_id")
    private long authorId;
    @Id
    @Column(name = "book_id")
    private long bookId;

    public AuthorBookDto(Long authorId, Long bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public AuthorBookDto() {

    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "AuthorBookDto{" +
                "authorId=" + authorId +
                ", bookId=" + bookId +
                '}';
    }
}
