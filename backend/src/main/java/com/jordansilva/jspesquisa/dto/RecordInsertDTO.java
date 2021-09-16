package com.jordansilva.jspesquisa.dto;

import java.io.Serializable;

import com.jordansilva.jspesquisa.entities.Game;
import com.jordansilva.jspesquisa.entities.enums.Platform;

public class RecordInsertDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	private Long gameId;
	
	public RecordInsertDTO() {
		//default constructor
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
	

}
