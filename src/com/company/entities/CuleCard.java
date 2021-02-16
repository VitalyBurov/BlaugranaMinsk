package com.company.entities;

import java.util.Objects;

public class CuleCard {
    private int id;
    private String name;

    public CuleCard(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuleCard culeCard = (CuleCard) o;
        return id == culeCard.id && Objects.equals(name, culeCard.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "CuleCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
