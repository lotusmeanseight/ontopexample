package entity;

import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "tb_authors")
public class Author {

    public Author() {
    }

    @EmbeddedId
    private AuthorID authorID;

    public AuthorID getAuthorID() {
        return authorID;
    }

    public void setAuthorID(AuthorID authorID) {
        this.authorID = authorID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equal(authorID, author.authorID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authorID);
    }
}

