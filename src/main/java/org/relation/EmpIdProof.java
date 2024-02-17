package org.relation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpIdProof {
    @Id
    private int proofId;
    private String proofType;
    @ManyToOne
    private employeeDetaile empD;

    public EmpIdProof() {
        super();
    }

    public EmpIdProof(int proofId, String proofType, employeeDetaile empD) {
        this.proofId = proofId;
        this.proofType = proofType;
        this.empD = empD;
    }

    public int getProofId() {
        return proofId;
    }

    public void setProofId(int proofId) {
        this.proofId = proofId;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public employeeDetaile getEmpD() {
        return empD;
    }

    public void setEmpD(employeeDetaile empD) {
        this.empD = empD;
    }
}
