package br.com.java.estoque.service;
import br.com.java.estoque.model.Produto;
import br.com.java.estoque.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class EstoqueServiceMemory {

    public List<Produto> estoque = new ArrayList<>();

        public void adicionarProduto(int id, String nome, double preco, int quantidade, Categoria categoria) {
        Produto produto = new Produto(id, nome, preco, quantidade, categoria);
        estoque.add(produto);
    }

    public List<Produto> listarProdutos() {
        return estoque;
    }

    public List<Produto> listarPorCategoria(Categoria categoria) {
        List<Produto> filtrados = new ArrayList<>();

        for (Produto produto : estoque) {
            if (produto.getCategoria() == categoria) {
                filtrados.add(produto);
            }
        }

        return filtrados;
    }
}


