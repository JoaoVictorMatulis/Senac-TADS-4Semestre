package br.com.curso.faculdade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.faculdade.entities.Aluno;
import br.com.curso.faculdade.repositories.AlunoRepository;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno findById(Integer ra){
        Optional<Aluno> aluno = alunoRepository.findById(ra);
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodosAbertos(){
        List<Aluno> alunos = alunoRepository.listarTodosAbertos();
        return alunos;
    }

    public List<Aluno> listarTodosFechados(){
        List<Aluno> alunos = alunoRepository.listarTodosFechados();
        return alunos;
    }
}
