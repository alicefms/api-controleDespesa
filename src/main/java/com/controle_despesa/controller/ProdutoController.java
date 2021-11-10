package com.controle_despesa.controller;


import com.controle_despesa.model.dto.CategoriaDTO;
import com.controle_despesa.model.dto.ProdutoDTO;
import com.controle_despesa.model.entity.Produto;
import com.controle_despesa.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repositoryProduto;

    @GetMapping
    public List<ProdutoDTO> listarProdutos(){
        List<Produto> produtoLista = repositoryProduto.findAll();
        return ProdutoDTO.converter(produtoLista);
    }

    @PostMapping
    public void salvarP(@RequestBody Produto produto){
        repositoryProduto.save(produto);
    }

    @DeleteMapping("/{id}")
    public void excluirP(@PathVariable Long id){
        repositoryProduto.deleteById(id);
    }

}
