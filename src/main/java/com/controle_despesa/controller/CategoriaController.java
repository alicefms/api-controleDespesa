package com.controle_despesa.controller;

import com.controle_despesa.model.dto.CategoriaDTO;
import com.controle_despesa.model.entity.Categoria;
import com.controle_despesa.model.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired  // cria uma instancia sem usar o new()
    private CategoriaRepository repository;

    @GetMapping //para testar no postman, faço um post com um json
    public List<CategoriaDTO> listarTudo(){
        List<Categoria> categoriaLista = repository.findAll();
        return CategoriaDTO.converter(categoriaLista);
    }

    @PostMapping
    public void salvar(@RequestBody Categoria categoria){
        repository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/{id}") //se eu criar 2 métodos desse (PUT) p alterar 2 atributos, dá ambiguidade de mapping
    public void alterar(@PathVariable Long id, @RequestBody Categoria categoria){
        Categoria categoriaPesquisada = repository.getOne(id);

        if(categoriaPesquisada != null){
            categoriaPesquisada.setDataCadastro(categoria.getDataCadastro());
            repository.save(categoriaPesquisada);
        }
    }
//nao funciona
    @GetMapping("/{id}")
    public Categoria pesquisarPorId(@PathVariable Long id){
       return repository.getById(id);
    }
}
