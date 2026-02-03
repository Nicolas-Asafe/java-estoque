package br.com.java.estoque.app;
import br.com.java.estoque.service.EstoqueServiceMemory;

class Main {
    public void main(String[] args) {
        EstoqueServiceMemory estoque = new EstoqueServiceMemory();
        estoque.adicionarProduto(1, "Caneta", 2.50, 100);
        estoque.listarProdutos();
    }
}