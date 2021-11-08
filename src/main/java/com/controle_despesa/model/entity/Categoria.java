package com.controle_despesa.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//a dependência LOMBOK facilita fazer os gets, sets e construtores padrão:
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Categoria {
    private Long id;
    private String descricao;
}
