package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="Films")
public class Film implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;
    private String title;

    private LocalDate releaseDate;
    @ManyToMany
    private List<Category> categories = new ArrayList<>();
    @ManyToMany
    private List<Producer> producers = new ArrayList<>();
    @ManyToMany
    private List<Actor> actors = new ArrayList<>();

    //Constructors

    public Film() {
    }

    public Film(long id, String title, LocalDate releaseDate, List<Category> categories, List<Producer> producers, List<Actor> actors) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.categories = categories;
        this.producers = producers;
        this.actors = actors;
    }

    //Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    //toString

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", version=" + version +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", categories=" + categories +
                ", producers=" + producers +
                ", actors=" + actors +
                '}';
    }

    //Methods

}
