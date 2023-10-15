package br.com.curso.faculdade.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import br.com.curso.faculdade.entities.Aluno;
import br.com.curso.faculdade.repositories.AlunoRepostirory;

@Configuration
@Service
public class DBService {
    @Autowired
    private AlunoRepostirory alunoRepostirory;

    @Bean
    public void instanciarDB() throws ParseException{
        Aluno aluno1 = new Aluno("João Victor Matulis", "04734902", 1142445416, "Nenhum", 8.5f, 9.0f);
		alunoRepostirory.saveAll(Arrays.asList(aluno1));
    }
}
