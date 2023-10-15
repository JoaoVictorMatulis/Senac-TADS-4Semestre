 package br.com.curso.faculdade.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity (name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column (name = "Nome")
    String nome;

    @Column (name = "CEP")
    String CEP;

    @Column (name = "Número")
    int num;

    @Column (name = "Complemento")
    String comp;

    @Column (name = "Nota Ado1")
    float ado1;

    @Column (name = "Nota PI")
    float pi;

    public Aluno() {
    }

    public Aluno(int ra, String nome, String cEP, int num, String comp, float ado1, float pi) {
        this.ra = ra;
        this.nome = nome;
        CEP = cEP;
        this.num = num;
        this.comp = comp;
        this.ado1 = ado1;
        this.pi = pi;
    }

    public Aluno(String nome, String cEP, int num, String comp, float ado1, float pi) {
        this.nome = nome;
        CEP = cEP;
        this.num = num;
        this.comp = comp;
        this.ado1 = ado1;
        this.pi = pi;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public float getAdo1() {
        return ado1;
    }

    public void setAdo1(float ado1) {
        this.ado1 = ado1;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", CEP=" + CEP + ", num=" + num + ", comp=" + comp + ", ado1="
                + ado1 + ", pi=" + pi + "]";
    }
    
    
}
