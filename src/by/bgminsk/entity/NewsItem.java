package by.bgminsk.entity;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class NewsItem {
    private int id;
    private String title;
    private String content;
    private String author;
    private LocalDate dateOfPublic;

    public NewsItem(int id, String title, String content, String author, LocalDate dateOfPublic) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.dateOfPublic = dateOfPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsItem newsItem = (NewsItem) o;
        return id == newsItem.id && Objects.equals(title, newsItem.title) && Objects.equals(content, newsItem.content) && Objects.equals(author, newsItem.author) && Objects.equals(dateOfPublic, newsItem.dateOfPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, author, dateOfPublic);
    }
}

