package entity;

import com.google.common.base.Objects;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_bk_gen")
public class Genre {

    public Genre(){}

    @EmbeddedId
    private GenreID genreID;

    public GenreID getGenreID() {
        return genreID;
    }

    public void setGenreID(GenreID genreID) {
        this.genreID = genreID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equal(genreID, genre.genreID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(genreID);
    }
}
