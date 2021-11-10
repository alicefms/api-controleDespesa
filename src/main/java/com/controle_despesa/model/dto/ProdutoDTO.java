package com.controle_despesa.model.dto;


import com.controle_despesa.model.entity.Produto;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ProdutoDTO {
    private String descricao;
    private int valorUnitario;
    private String unidadeMedida;

    public ProdutoDTO(Produto produto){
        this.descricao = produto.getDescricao();
        this.valorUnitario = produto.getValorUnitario();
        this.unidadeMedida= produto.getUnidadeMedida();
    }

    public static List<ProdutoDTO> converter(List<Produto> produtos){
        return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }


}
