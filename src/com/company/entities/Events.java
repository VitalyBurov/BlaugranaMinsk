package com.company.entities;

import java.util.Objects;

public class Events {
    private int id;
    private String name;
    private String palace;
    private String description;
    private String author;

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

    public String getPalace() {
        return palace;
    }

    public void setPalace(String palace) {
        this.palace = palace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Events(int id, String name, String palace, String description, String author) {
        this.id = id;
        this.name = name;
        this.palace = palace;
        this.description = description;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return id == events.id && Objects.equals(name, events.name) && Objects.equals(palace, events.palace) && Objects.equals(description, events.description) && Objects.equals(author, events.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, palace, description, author);
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", palace='" + palace + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
