package entity;


import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class AuthorID implements Serializable {

    @Column(name = "bk_code")
    @NotNull
    private Integer bookCode;
    @Column(name = "wr_id")
    @NotNull
    private Integer writerID;

    public AuthorID(){
    }

    public AuthorID(Integer bookCode, Integer writerID){
        this.bookCode = bookCode;
        this.writerID = writerID;
    }

    public Integer getBookCode() {
        return bookCode;
    }

    public Integer getWriterID() {
        return writerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorID authorID = (AuthorID) o;
        return Objects.equal(bookCode, authorID.bookCode) &&
                Objects.equal(writerID, authorID.writerID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookCode, writerID);
    }
}
