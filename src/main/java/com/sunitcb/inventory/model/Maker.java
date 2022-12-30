package com.sunitcb.inventory.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Maker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String countryOfOrigin;
    @OneToMany
    @JoinTable(name="maker_gadget", joinColumns = @JoinColumn(name="maker_id"), inverseJoinColumns = @JoinColumn(name="gadget_id"))
    private List<Gadget> gadgetList;

    public Maker(){

    }
    public Maker(String name, String countryOfOrigin, List<Gadget> gadgetList) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.gadgetList = gadgetList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public List<Gadget> getGadgetList() {
        return gadgetList;
    }

    public void setGadgetList(List<Gadget> gadgetList) {
        this.gadgetList = gadgetList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maker maker = (Maker) o;

        return Objects.equals(id, maker.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
