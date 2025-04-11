package com.seuprojeto.inicionodari.model;

// importando as propriedades loconas do trem...slc... bao demaisi
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
    
    //aqui eu falo pro banco "ó, faz uma tabela com essa config" (ele transforma Long,String,etc em referencias no banco do tipo id,Varchar,etc)
    @Id
    private Long id;
    private String nome;
    private int idade;

    //igual o Renan fazia em POO, até a sintaxe 
    public Long getId(){return id;}
    public void setId(Long id){ this.id = id;}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade=idade;}

}
