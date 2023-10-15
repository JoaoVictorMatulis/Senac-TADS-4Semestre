package br.com.curso.faculdade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.curso.faculdade.entities.Aluno;

@Repository
public interface AlunoRepostirory extends JpaRepository<Aluno, Integer>{
    
}
