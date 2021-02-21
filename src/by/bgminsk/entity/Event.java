package by.bgminsk.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private int id;
    private String name;
    private String palace;
    private String description;
    private String author;
    private LocalDate dateOfPublic;

 /*   public int getId() {
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

    public LocalDate getDateOfPublic() {
        return dateOfPublic;
    }

    public void setDateOfPublic(LocalDate dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }

    public Event(int id, String name, String palace, String description, String author, LocalDate dateOfPublic) {
        this.id = id;
        this.name = name;
        this.palace = palace;
        this.description = description;
        this.author = author;
        this.dateOfPublic = dateOfPublic;
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
        return Objects.hash(id, name, palace, description, author, dateOfPublic);
    }*/
}
