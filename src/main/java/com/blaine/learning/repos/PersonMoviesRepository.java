package com.blaine.learning.repos;

import com.blaine.learning.entities.PersonMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMoviesRepository extends JpaRepository<PersonMovies,Integer> {

}
