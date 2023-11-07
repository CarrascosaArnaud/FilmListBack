package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class FilmProducer implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    @OneToOne
    private Film film;

    @OneToOne
    private Producer producer;

    //Constructors

    public FilmProducer() {
    }

    public FilmProducer(long id, Film film, Producer producer) {
        this.id = id;
        this.film = film;
        this.producer = producer;
    }

    //Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    //toString

    @Override
    public String toString() {
        return "FilmProducer{" +
                "id=" + id +
                ", version=" + version +
                ", film=" + film +
                ", producer=" + producer +
                '}';
    }

    //Methods

}
