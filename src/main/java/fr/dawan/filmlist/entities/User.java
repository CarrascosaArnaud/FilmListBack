package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;


}
