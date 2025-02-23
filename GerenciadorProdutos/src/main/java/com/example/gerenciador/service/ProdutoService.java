package com.example.gerenciador.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gerenciador.model.Produto;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long proximoId = 1L;

    public List<Produto> listar() {
        return produtos;
    }

    public Produto adicionar(Produto produto) {
        produto.setId(proximoId++);
        produtos.add(produto);
        return produto;
    }
}
