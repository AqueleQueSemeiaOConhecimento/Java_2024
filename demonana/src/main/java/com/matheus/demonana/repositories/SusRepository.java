package com.matheus.demonana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheus.demonana.models.Sus;

@Repository
public interface SusRepository extends JpaRepository<Sus, Long>{

}