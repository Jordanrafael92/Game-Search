package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordansilva.jspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
