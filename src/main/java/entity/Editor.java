package entity;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_editor")
public class Editor {

    public Editor(){}

    @Id
    @NotNull
    private Integer ed_code;
    @NotNull
    @Column(length = 100)
    private String name;

    public Integer getEd_code() {
        return ed_code;
    }

    public void setEd_code(Integer ed_code) {
        this.ed_code = ed_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
