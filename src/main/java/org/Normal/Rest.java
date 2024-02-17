package org.Normal;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class Rest {
    @Id
    private int id;
    private String name;
    private String city;

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

    public Rest(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Rest() {
        super();
    }

    @Override
    public String toString() {
        return "Rest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
