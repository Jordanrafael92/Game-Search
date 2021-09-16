package com.jordansilva.jspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordansilva.jspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
