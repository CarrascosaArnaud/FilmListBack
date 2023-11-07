package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class FilmActor implements Serializable {
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
    private Actor actor;

    //Constructors

    public FilmActor() {
    }

    public FilmActor(long id, Film film, Actor actor) {
        this.id = id;
        this.film = film;
        this.actor = actor;
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

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //toString

    @Override
    public String toString() {
        return "FilmActor{" +
                "id=" + id +
                ", version=" + version +
                ", film=" + film +
                ", actor=" + actor +
                '}';
    }

    //Methods

}
