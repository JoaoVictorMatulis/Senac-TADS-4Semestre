package br.com.curso.faculdade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.curso.faculdade.engine.Aluno;
import br.com.curso.faculdade.repositories.AlunoRepository;

@SpringBootApplication
public class FaculdadeApplication implements CommandLineRunner {
	@Autowired
	private AlunoRepository alunoRepository;

	public static void main(String[] args) {
		SpringApplication.run(FaculdadeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Aluno aluno1 = new Aluno("Marcos Monteiro",  LocalDateTime.parse("01/08/2022 08:30", formato));
		alunoRepository.saveAll(Arrays.asList(aluno1));
	}

}
