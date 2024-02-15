package com.blaine.learning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "person_books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int person_id;
    private int book_id;
    private String checkout_date;
}
