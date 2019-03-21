package entity;

import com.sun.istack.NotNull;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_emerge_authors")
public class EmergeAuthor {

    public EmergeAuthor(){}

    @EmbeddedId
    private AuthorID authorID;

    public AuthorID getAuthorID() {
        return authorID;
    }

    public void setAuthorID(AuthorID authorID) {
        this.authorID = authorID;
    }
}
