package entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_books")
public class Book {

   public Book(){
    }

    @Id
    @javax.validation.constraints.NotNull
    @Column(name = "bk_code")
    private Integer bookCode;
    @NotNull
    @Column(name = "bk_title", length = 100)
    private String bookTitle;
    @NotNull
    @Column(name = "bk_type", length = 100)
    @ColumnDefault("X")
    private String bookType;


    public Integer getBookCode() {
        return bookCode;
    }

    public void setBookCode(Integer bk_code) {
        this.bookCode = bk_code;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bk_title) {
        this.bookTitle = bk_title;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bk_type) {
        this.bookType = bk_type;
    }

}
