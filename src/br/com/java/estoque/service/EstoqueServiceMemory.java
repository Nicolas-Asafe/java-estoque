package br.com.java.estoque.service;
import br.com.java.estoque.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class EstoqueServiceMemory {
    List<Produto> estoque = new ArrayList<Produto>();

    public void adicionarProduto(int id, String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, id, preco, quantidade);
        estoque.add(produto);
    }
    public void listarProdutos() {
        for (Produto produto : estoque) {
            produto.PrintProduto();
        }
    }
}
