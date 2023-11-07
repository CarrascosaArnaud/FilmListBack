package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="FavoriteFilms")
public class FavoriteFilm implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;
    @ManyToOne
    private User user;
    @OneToMany()
    private List<Actor> actors = new ArrayList<>();

    //Constructors

    public FavoriteFilm() {
    }

    public FavoriteFilm(long id, User user, List<Actor> actors) {
        this.id = id;
        this.user = user;
        this.actors = actors;
    }
    //Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        return "FavoriteFilm{" +
                "id=" + id +
                ", version=" + version +
                ", user=" + user +
                ", actors=" + actors +
                '}';
    }

    //Methods

}
