package org.OneTo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmpD {
    @Id
    private int id;
    private String name;
    private String city;
    @OneToOne
    private EmpWork empWork;

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

    public EmpWork getEmpWork() {
        return empWork;
    }

    public void setEmpWork(EmpWork empWork) {
        this.empWork = empWork;
    }

    public EmpD(int id, String name, String city, EmpWork empWork) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.empWork = empWork;
    }

    public EmpD() {
        super();
    }
}
