package com.example.forum.repository;

import com.example.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	Curso findByNome(String nome);
}