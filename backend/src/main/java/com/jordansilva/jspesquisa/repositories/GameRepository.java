package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordansilva.jspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
