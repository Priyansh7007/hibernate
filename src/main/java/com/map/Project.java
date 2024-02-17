package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Project {
    @Id
    private int pid;
    private String projectName;
    @ManyToOne
    private Emp emp;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Project() {
        super();
    }

    public Project(int pid, String projectName, Emp emp) {
        this.pid = pid;
        this.projectName = projectName;
        this.emp = emp;
    }
}
