package br.com.curso.faculdade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.faculdade.entities.Aluno;
import br.com.curso.faculdade.repositories.AlunoRepostirory;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepostirory alunoRepostirory;

    public List<Aluno> findAll(){
        List<Aluno> alunos = alunoRepostirory.findAll();
        return alunos;
    }

    public Aluno findById(Integer ra){
        Optional<Aluno> aluno  = alunoRepostirory.findById(ra);
        return aluno.orElse(null);
    }

    public Aluno gravarAluno(Aluno aluno){  
        return alunoRepostirory.save(aluno);
    }

    public void deletar(Integer ra){
        alunoRepostirory.deleteById(ra);
    }

    public Aluno update(Integer ra, Aluno aluno){
        Aluno alterado = findById(ra);
        if(alterado!=null){
            alterado.setNome(aluno.getNome());
            alterado.setCEP(aluno.getCEP());
            alterado.setNum(aluno.getNum());
            alterado.setComp(aluno.getComp());
            alterado.setAdo1(aluno.getAdo1());
            alterado.setPi(aluno.getPi());
            return alunoRepostirory.save(alterado);
        }
        return null;
    }
}
