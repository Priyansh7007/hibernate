package org.OneTo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmpWork {
    @Id
    private int id;
    private String Work;
    @OneToOne
    private EmpD empD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWork() {
        return Work;
    }

    public void setWork(String work) {
        Work = work;
    }

    public EmpD getEmpD() {
        return empD;
    }

    public void setEmpD(EmpD empD) {
        this.empD = empD;
    }

    public EmpWork(int id, String work, EmpD empD) {
        this.id = id;
        Work = work;
        this.empD = empD;
    }

    public EmpWork() {
        super();
    }
}
