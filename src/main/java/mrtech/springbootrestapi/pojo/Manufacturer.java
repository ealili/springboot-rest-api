package mrtech.springbootrestapi.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    private String mname;
    private String headquarters;

    @JsonIgnoreProperties("manufacturer")
    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
    private List<Phone> phones;

    public Manufacturer() {
    }

    public Manufacturer(String mname, String headquarters) {
        this.mname = mname;
        this.headquarters = headquarters;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
}
