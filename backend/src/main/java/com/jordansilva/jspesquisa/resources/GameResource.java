package com.jordansilva.jspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordansilva.jspesquisa.entities.Game;
import com.jordansilva.jspesquisa.repositories.GameRepository;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	
	@GetMapping
	public ResponseEntity<List<Game>> findAll() {
		List<Game> list = gameRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
		
}
