package br.com.java.estoque.model;

public class Produto{
    public int id;
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, int id, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void PrintProduto() {
        System.out.println("ID: " + id + " | Nome: " + nome + " Preço: R$ " + preco + " Quantidade: " + quantidade);

    }
}
