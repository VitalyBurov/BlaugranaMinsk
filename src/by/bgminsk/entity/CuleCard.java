package by.bgminsk.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CuleCard {

    private int id;

    private String name;

    private LocalDate activeTo;

 /*   public CuleCard(int id, String name, LocalDate activeTo) {
        this.id = id;
        this.name = name;
        this.activeTo = activeTo;
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

    public LocalDate getActiveTo() {
        return activeTo;
    }

    public void setActiveTo(LocalDate activeTo) {
        this.activeTo = activeTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuleCard culeCard = (CuleCard) o;
        return id == culeCard.id &&
                Objects.equals(name, culeCard.name) &&
                Objects.equals(activeTo, culeCard.activeTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, activeTo);
    }


    @Override
    public String toString() {
        return "CuleCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", activeTo=" + activeTo +
                '}';
    }*/
}
