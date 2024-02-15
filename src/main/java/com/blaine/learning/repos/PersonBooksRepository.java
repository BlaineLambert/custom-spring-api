package com.blaine.learning.repos;

import com.blaine.learning.entities.PersonBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonBooksRepository extends JpaRepository<PersonBooks,Integer> {

}
