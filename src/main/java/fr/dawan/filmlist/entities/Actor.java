package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Actors")
public class Actor implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    @Column(length = 50, nullable = false)
    private String name, email;

    @Column(length = 20, nullable = false)
    private String password;

    //Constructors
    public Actor() {
    }

    public Actor(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", version=" + version +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //Methods
}
