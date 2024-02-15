package com.blaine.learning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "person_movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonMovies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int person_id;
    private int movie_id;
    private String checkout_date;
}
