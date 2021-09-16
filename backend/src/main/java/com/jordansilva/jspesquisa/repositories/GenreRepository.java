package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordansilva.jspesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
