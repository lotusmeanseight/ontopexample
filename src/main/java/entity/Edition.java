package entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "tb_edition")
public class Edition {

    public Edition(){
    }

    @Id
    @NotNull
    private Integer ed_code;
    @NotNull
    @Column(length = 1)
    private String ed_type;
    @NotNull
    private LocalDate pub_date;
    @NotNull
    private Integer n_edt;
    @NotNull
    private Integer editor;
    @NotNull
    private Integer bk_id;

    public Integer getEd_code() {
        return ed_code;
    }

    public void setEd_code(Integer ed_code) {
        this.ed_code = ed_code;
    }

    public String getEd_type() {
        return ed_type;
    }

    public void setEd_type(String ed_type) {
        this.ed_type = ed_type;
    }

    public LocalDate getPub_date() {
        return pub_date;
    }

    public void setPub_date(LocalDate pub_date) {
        this.pub_date = pub_date;
    }

    public Integer getN_edt() {
        return n_edt;
    }

    public void setN_edt(Integer n_edt) {
        this.n_edt = n_edt;
    }

    public Integer getEditor() {
        return editor;
    }

    public void setEditor(Integer editor) {
        this.editor = editor;
    }

    public Integer getBk_id() {
        return bk_id;
    }

    public void setBk_id(Integer bk_id) {
        this.bk_id = bk_id;
    }
}
