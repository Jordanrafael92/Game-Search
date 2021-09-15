package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordansilva.jspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
