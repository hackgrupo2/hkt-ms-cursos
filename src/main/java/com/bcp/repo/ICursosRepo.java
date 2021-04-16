package com.bcp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcp.model.Curso;

public interface ICursosRepo extends JpaRepository<Curso, Integer>{

}
