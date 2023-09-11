package br.com.curso.faculdade.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import br.com.curso.faculdade.entities.Aluno;
import br.com.curso.faculdade.repositories.AlunoRepository;

@Service
public class DBService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Bean
    public void instanciarDB() throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Aluno aluno1 = new Aluno("João Victor Matulis",  formato.parse("02/06/2003"), true);
        Aluno aluno2 = new Aluno("Lucas Matulis",  formato.parse("02/03/2002"), true);
        Aluno aluno3 = new Aluno("Leonardo Matulis",  formato.parse("13/12/2004"), true);
        Aluno aluno4 = new Aluno("Pedro Augusto Matulis",  formato.parse("15/10/1970"), false);
		alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
    }
}
