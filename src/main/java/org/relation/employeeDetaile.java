package org.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class employeeDetaile {
    @Id
    private int id;
    private String name;
    private String city;
    @OneToMany
    private List<EmpIdProof> idProofs;

    public employeeDetaile() {
        super();
    }

    public employeeDetaile(int id, String name, String city, List<EmpIdProof> idProofs) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.idProofs = idProofs;
    }

    public List<EmpIdProof> getIdProofs() {
        return idProofs;
    }

    public void setIdProofs(List<EmpIdProof> idProofs) {
        this.idProofs = idProofs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "employeeDetaile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", idProofs=" + idProofs +
                '}';
    }
}
