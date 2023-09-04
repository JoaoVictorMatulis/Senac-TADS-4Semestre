package br.com.curso.faculdade.engine;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Alunos")
public class Aluno implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column (name = "Nome")
    String nome;

    LocalDateTime dataCadastro;    

    public Aluno(String nome, LocalDateTime dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Aluno() {
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", dataCadastro=" + dataCadastro + "]";
    }
}
