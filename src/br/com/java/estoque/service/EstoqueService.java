package br.com.java.estoque.service;
import br.com.java.estoque.model.Produto;
import br.com.java.estoque.model.Categoria;
import br.com.java.estoque.respository.EstoqueRepositoryMemory;

import java.util.ArrayList;
import java.util.List;

public class EstoqueService {

    public EstoqueRepositoryMemory estoqueRepository;

    public EstoqueService(EstoqueRepositoryMemory repo){
        this.estoqueRepository = repo;
    }

    public void adicionarProduto(int id, String nome, double preco, int quantidade, Categoria categoria) {
        Produto produto = new Produto(id, nome, preco, quantidade, categoria);
        estoqueRepository.estoque.add(produto);
    }

    public List<Produto> listarProdutos() {
        return estoqueRepository.estoque;
    }
    public void PrintarProdutosDaCategoria(Categoria categoria){
        for (Produto p : this.listarPorCategoria(categoria)){
            p.PrintProduto();
        }
    }
    public List<Produto> listarPorCategoria(Categoria categoria) {
        List<Produto> filtrados = new ArrayList<>();

        for (Produto produto : estoqueRepository.estoque) {
            if (produto.getCategoria() == categoria) {
                filtrados.add(produto);
            }
        }

        return filtrados;
    }
}


