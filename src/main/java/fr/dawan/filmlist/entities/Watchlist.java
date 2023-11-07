package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="Watchlists")
public class Watchlist implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "watchlist")
    private List<Film> films = new ArrayList<>();

    //Constructors

    public Watchlist() {
    }

    public Watchlist(long id, User user, List<Film> films) {
        this.id = id;
        this.user = user;
        this.films = films;
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

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    //toString

    @Override
    public String toString() {
        return "Watchlist{" +
                "id=" + id +
                ", version=" + version +
                ", user=" + user +
                ", films=" + films +
                '}';
    }

    //Methods

}
