package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordansilva.jspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
