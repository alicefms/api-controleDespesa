package com.controle_despesa.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//a dependência LOMBOK facilita fazer os gets, sets e construtores padrão:
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //faz com q gere automatico a ID. Se eu colocar uma Id, o programa ignora .
    private Long id;
    private String descricao;
    private String dataCadastro;
}
