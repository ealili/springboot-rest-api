package mrtech.springbootrestapi.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    private String mname;
    private String headquarters;

    public Manufacturer() {
    }

    public Manufacturer(String mname, String headquarters) {
        this.mname = mname;
        this.headquarters = headquarters;
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
