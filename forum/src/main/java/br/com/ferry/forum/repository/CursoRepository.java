package br.com.ferry.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ferry.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
