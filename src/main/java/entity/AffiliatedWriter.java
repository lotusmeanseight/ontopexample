package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_affiliated_writers")
public class AffiliatedWriter {

    public AffiliatedWriter(){}

    @Id
    @NotNull
    private Integer wr_code;
    @NotNull
    @Column(length = 100)
    private String wr_name;

    public String getWr_name() {
        return wr_name;
    }

    public void setWr_name(String wr_name) {
        this.wr_name = wr_name;
    }
}
