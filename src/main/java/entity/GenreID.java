package entity;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GenreID implements Serializable {

    @Column(name = "id_bk")
    private Integer bookID;
    @Column(name = "gen_name", length = 100)
    private String genreName;

    public Integer getBookID() {
        return bookID;
    }

    public String getGenreName() {
        return genreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreID genreID = (GenreID) o;
        return Objects.equal(bookID, genreID.bookID) &&
                Objects.equal(genreName, genreID.genreName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookID, genreName);
    }
}
