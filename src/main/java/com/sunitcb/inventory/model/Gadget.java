package com.sunitcb.inventory.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Gadget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String dimensions;
    @OneToOne
    private GadgetCategory category;

    public Gadget(){}

    public Gadget(String name, String dimensions, GadgetCategory category) {
        this.name = name;
        this.dimensions = dimensions;
        this.category = category;
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

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public GadgetCategory getCategory() {
        return category;
    }

    public void setCategory(GadgetCategory category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gadget gadget = (Gadget) o;

        return Objects.equals(id, gadget.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
