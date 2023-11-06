package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Producers")
public class Producer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;


}
