package by.bgminsk.entity;

import java.util.Objects;

public class Event {
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

    public Event(int id, String name, String palace, String description, String author) {
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
        Event event = (Event) o;
        return id == event.id && Objects.equals(name, event.name) && Objects.equals(palace, event.palace) && Objects.equals(description, event.description) && Objects.equals(author, event.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, palace, description, author);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", palace='" + palace + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
