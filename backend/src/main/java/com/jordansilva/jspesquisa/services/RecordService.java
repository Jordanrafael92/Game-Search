package com.jordansilva.jspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jordansilva.jspesquisa.dto.RecordDTO;
import com.jordansilva.jspesquisa.dto.RecordInsertDTO;
import com.jordansilva.jspesquisa.entities.Game;
import com.jordansilva.jspesquisa.entities.Record;
import com.jordansilva.jspesquisa.repositories.GameRepository;
import com.jordansilva.jspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		repository.save(entity);
		return new RecordDTO(entity);
	}
}
