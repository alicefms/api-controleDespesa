package com.controle_despesa.model.dto;

import com.controle_despesa.model.entity.Categoria;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CategoriaDTO {
    //coloco no DTO os atributos que eu quero deixar mudar, deixar visualizar; os que eu quero proteger não coloco.
    //**nao pode ter atributos de tipo complexo, só de tipo primitivo.
    private String descricao;

    public CategoriaDTO(Categoria categoria){
        this.descricao =categoria.getDescricao();
    }

    //converte a entidade numa entidadeDTO
    public static List<CategoriaDTO> converter (List<Categoria> categorias){
        return categorias.stream().map(CategoriaDTO::new).collect(Collectors.toList());
    //uso o stream para poder usar o map, e depois converto em List de novo
    }
}
